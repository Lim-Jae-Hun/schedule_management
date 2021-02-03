package kr.co.zzaehoonx2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

	@RequestMapping(value = "/index")
	public String home2(HttpServletRequest req, RedirectAttributes rttr) {

		return "mainIndex";
	}

}
