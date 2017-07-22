package onlineshopingid.onlineshoping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import onlineShopping.dao.CategoryDAO;
import onlineShopping.dto.Category;

@Controller
public class MyController {
		
		@Autowired
		private CategoryDAO categoryDAO;
	
		@RequestMapping(value={"/","/home","/index"})
		public ModelAndView index(){
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","Home");
			mv.addObject("isUserClickHome",true);
			mv.addObject("categories",categoryDAO.list());
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
		
		@RequestMapping(value = "/show/all/products")
		public ModelAndView showAllProducts(){
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","All products");
			mv.addObject("isUserClickAllProducts",true);
			mv.addObject("categories",categoryDAO.list());
			return mv;
		}
		
		@RequestMapping(value = "/show/category/{id}/products")
		public ModelAndView showCategoryProducts(@PathVariable("id") int id){
			ModelAndView mv = new ModelAndView("page");
			System.out.println("Category Id:::::::::::"+id);
			/*feach the products according to selected category  id*/
			Category category = null;
			category = categoryDAO.get(id);
			
			mv.addObject("title",category.getName());
			mv.addObject("category",category);
			
			mv.addObject("isUserClickCategoryProducts",true);
			mv.addObject("categories",categoryDAO.list());
			return mv;
		}
}
