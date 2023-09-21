package springmVc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) {
//		System.out.println("This is home url");
		model.addAttribute("name", "Aniket Singh");
		return "index1";
	}
	
//	@RequestMapping("/about")
//	public String about() {
//		System.out.println("This is about controller");
//	}
}
