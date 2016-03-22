package com.boshu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EchoController {
	@RequestMapping(value = "echo", method = RequestMethod.GET)
	public String action(ModelMap model) {
		model.addAttribute("message", "Hello from boshu");
		return "action";
	}
}
