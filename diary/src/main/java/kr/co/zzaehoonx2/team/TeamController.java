package kr.co.zzaehoonx2.team;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.zzaehoonx2.member.domain.MemberDTO;
import kr.co.zzaehoonx2.member.service.IMemberService;

@Controller
@RequestMapping("/team")
public class TeamController {

	@Autowired
	private IMemberService service;
	
	// 팀 메인 페이지
	@RequestMapping(value = "/index")
	public String mainIndex(HttpServletRequest req) {
		
		HttpSession session = req.getSession();
		MemberDTO dto = (MemberDTO) session.getAttribute("member");
		
		
		return "teamIndex";
	}
}
