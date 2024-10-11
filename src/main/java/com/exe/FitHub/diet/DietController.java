package com.exe.FitHub.diet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/fithub/diet")
public class DietController {

	@RequestMapping("/main")
	public String main() {
		
		return "/dietManagement/main";	
	}
	
}
