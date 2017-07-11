package onlineshopingid.onlineshoping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

		@RequestMapping(value={"/","/home","/index"})
		public ModelAndView index(){
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","Home");
			mv.addObject("isUserClickHome",true);
			return mv;
		}
		
		@RequestMapping(value={"/about"})
		public ModelAndView aboutUs(){
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","About Us");
			mv.addObject("isUserClickAbout",true);
			return mv;
		}
		
		@RequestMapping(value={"/contact"})
		public ModelAndView contactUs(){
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","Contact Us");
			mv.addObject("isUserClickContact",true);
			return mv;
		}
		
		@RequestMapping(value={"/productList"})
		public ModelAndView productList(){
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","Product List");
			mv.addObject("isUserClickHomeProductList",true);
			return mv;
		}
}
