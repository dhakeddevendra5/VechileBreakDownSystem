package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.Entity.Breakdown;
import com.app.Service.BreakdownService;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private BreakdownService breakdownService;

	@GetMapping("/showAdmin")
	public String getMethodName(Model model) {
		model.addAttribute("breakdowns", breakdownService.getAllBreakDowns());
		return "admin"; // Returns the view name "admin"
	}

	@PostMapping("/update-status/{id}")
	public String updateStatus(@PathVariable Long id, @RequestParam String status) {
		Breakdown breakdown = breakdownService.updateStatus(id, status);

		breakdown.setStatus(status);
		breakdownService.addBreakdown(breakdown);
		return "redirect:/admin/showAdmin";
	}



}