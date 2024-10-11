package com.exe.FitHub.workouts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("fithub/workouts")
public class WorkoutsController {

	@RequestMapping("/main")
	public String main() {
		
		return "/workouts/main";
	}
	
}
