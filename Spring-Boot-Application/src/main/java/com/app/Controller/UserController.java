package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.Entity.Users;
import com.app.Service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/index")
	public String indexPage() {
		return "index";
	}
	
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}

	@PostMapping("/register")
	public String registerUser(@RequestParam String name, @RequestParam String number,
			@RequestParam String email, @RequestParam String password,
			@RequestParam String conformPassword,RedirectAttributes redirectAttributes) {
		if (!password.equals(conformPassword)) {
			redirectAttributes.addFlashAttribute("errorMessage", "Passwords do not match.");
            return "redirect:/user/register"; // Redirect back to register with error message
		}
		Users users = new Users();
		users.setName(name);
		users.setNumber(number);
		users.setEmail(email);
		users.setPassword(password);

		userService.registerUser(users);

		redirectAttributes.addFlashAttribute("successMessage", "You have been registered successfully.");
        return "redirect:/user/login";
	}

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String userLogin(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpSession seession) {
		Users users = userService.loginUser(email, password);
		if (users != null) {
			seession.setAttribute("users", users);
			return "redirect:/dashboard";
		}
		return "login";
	}
}
