package com.exe.FitHub;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@Controller
public class MainController {

	@RequestMapping("/")
	public String main() {
		
		return "/main/fitHubHome";	
	}
	
}
