package com.exe.FitHub.community;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@RequestMapping("fithub/community/free")
@RequiredArgsConstructor
@Controller
public class CommunityFreeController {
	

	
	@RequestMapping("/")
	public String freeList(Model model) {
		

		return "/community/free_list";
	}
	
	@GetMapping("/write")
	public String freeWrite(Model model) {
		

		return "/community/free_write";
	}
	
	@PostMapping("/write")
	public String freeWrite_ok(Model model) {
		

		return "/";
	}

	
	
}
