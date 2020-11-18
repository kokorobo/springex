package com.care.di_ex04;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/red")
public class RedirectController {
	@RequestMapping("index")
	public String index() {
		return "red/index";
	}
	@RequestMapping("result")
	public String result(HttpServletRequest req) {
		String id = req.getParameter("id");
		if(id.equals("abc")) {
			return "redirect:rsOK";
		}
		return "redirect:rsNO";
	}
	@RequestMapping("rsOK")
	public String resultOk() { return "red/rsOK";}
	@RequestMapping("rsNO")
	public String resultNo() { return "red/rsNO";}
}

