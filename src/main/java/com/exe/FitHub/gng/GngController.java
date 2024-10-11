package com.exe.FitHub.gng;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/fithub/gng")
public class GngController {

	@RequestMapping("/main")
	public String main() {
		
		return "/gearNgyms/main";	
	}
	
}
