package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.app.Entity.Breakdown;
import com.app.Entity.Users;
import com.app.Service.BreakdownService;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class BreakdownController {

	@Autowired
	BreakdownService breakdownService;
	
	@GetMapping("/dashboard")
	public String userDashboard(HttpSession session, Model model) {
	    Users users = (Users) session.getAttribute("users");
	    if (users == null) return "redirect:/login";

	    List<Breakdown> breakdowns = breakdownService.getBreakdown(users.getId());
	    session.setAttribute("breakdowns", breakdowns); // Store in session

	    model.addAllAttributes(breakdowns); // Add to model for JSP rendering
	    return "dashboard";
	}

	@PostMapping("/submitbreakdown")
	public String submitBreakdown(@ModelAttribute Breakdown breakdown,HttpSession session) {
		Users users=(Users)session.getAttribute("users");
		if(users==null)return"redirect:/login";
		
		breakdown.setUser(users);
		breakdownService.addBreakdown(breakdown);
		return "redirect:/dashboard";
	}
	@PostMapping("/logout")
	public String logout(HttpSession session) {
	    session.invalidate(); // Invalidate session
	    return "redirect:/user/login"; // Redirect to login page
	}
}
