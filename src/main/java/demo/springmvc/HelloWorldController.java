package demo.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("greeting","Hello Spring MVC");//"greeting"相當於servlet要傳出的Attribute
		return "helloword";//相當於servlet要丟給jsp的那個jsp的名字
	}
}
