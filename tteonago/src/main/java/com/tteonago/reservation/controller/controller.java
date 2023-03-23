package com.tteonago.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {
	@GetMapping("/purchase")
	public String purchase(@RequestParam(value = "roomId") String roomId,
			@RequestParam(value = "checkIn") String checkIn, @RequestParam(value = "checkOut") String checkOut,
			Model model) {
		model.addAttribute("checkIn", checkIn);
		model.addAttribute("checkOut", checkOut);
		model.addAttribute("roomId", roomId);
		return "pages/test";
	}
}
