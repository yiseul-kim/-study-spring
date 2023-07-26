package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")		// http://localhost:9696 
	public String index() {
		
		// 클라이언트 url에서 새롭게 요청
		return "redirect:/question/list"; 
	}
}
