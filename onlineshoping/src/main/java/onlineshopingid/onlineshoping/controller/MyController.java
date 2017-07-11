package onlineshopingid.onlineshoping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

		@RequestMapping(value={"/","/home","/index"})
		public ModelAndView index(){
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("message", "Welcome meghraj in your frist spring project.");
			return mv;
		}
}
