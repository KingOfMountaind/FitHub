package com.exe.FitHub.community;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@RequestMapping("fithub/community")
@RequiredArgsConstructor
@Controller
public class CommunityController {
	
	@RequestMapping("/notice")
	public String notice(Model model) {
		

		return "/community/notice";
	}
	
	@RequestMapping("/oneday")
	public String oneday(Model model) {
		

		return "/community/oneday";
	}
	
	@RequestMapping("/qna")
	public String com(Model model) {
		

		return "/community/qna";
	}
	
	
}
