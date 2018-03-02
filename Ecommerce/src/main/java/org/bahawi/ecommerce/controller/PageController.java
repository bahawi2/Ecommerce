package org.bahawi.ecommerce.controller;

import org.bahawi.Ecommercebackend.dao.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO CategoryDAO;
	
	@RequestMapping(value= {"/","/index"})
	public ModelAndView index() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "index");
		mv.addObject("categories", CategoryDAO.list());
		return mv;
	}
	@RequestMapping(value= {"/home"})
	public ModelAndView home() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("userClickhome", true);
		mv.addObject("title", "home");
		return mv;
	}
	@RequestMapping(value= {"/about"})
	public ModelAndView about() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("userClickabout", true);
		mv.addObject("title", "about");
		return mv;
	}
	@RequestMapping(value= {"/contact"})
	public ModelAndView contact () {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("userCliccontact", true);
		mv.addObject("title", "contact");
		return mv;
	}
	@RequestMapping(value= {"/listeproducts"})
	public ModelAndView listeproducts() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "listeproducts");
		mv.addObject("userClicklisteproducts", true);
		return mv;
	}


}
