package com.exe.FitHub.tools;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/fithub/tools")
public class ToolsController {

	@RequestMapping("/main")
	public String main() {
		
		return "/fitnessTools/main";	
	}
	
}
