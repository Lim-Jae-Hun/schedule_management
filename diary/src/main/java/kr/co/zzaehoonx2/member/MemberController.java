package kr.co.zzaehoonx2.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.zzaehoonx2.member.service.IMemberService;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private IMemberService service;
	
	@RequestMapping(value = "/mainIndex")
	public String mainIndex (HttpServletRequest req, RedirectAttributes rttr) {

		return "mainIndex";
	}
}
