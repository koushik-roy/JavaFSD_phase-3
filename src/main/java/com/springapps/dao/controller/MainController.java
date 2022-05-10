package com.springapps.dao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springapps.entity.LoginBean;
import com.springapps.entity.Product;
import com.springapps.entity.User;
import com.springapps.service.ProductService;
import com.springapps.service.UserService;

@Controller
public class MainController {

	@Autowired
	ProductService productService;
	@Autowired
	UserService userservice;

	@RequestMapping("/login")
	public String showLoginPage() {
		return "loginPage";
	}

	@RequestMapping(value = "adminlogin", method = RequestMethod.POST)
	public String showAdminPage(ModelMap model, @ModelAttribute("LoginBean") LoginBean loginBean) {
		if (loginBean != null && loginBean.getName() != null && loginBean.getPassword() != null) {
			if (loginBean.getName().equals("admin") && loginBean.getPassword().equals("root")) {
				List<Product> products = productService.getProducts();
				model.addAttribute("products", products);

				return "AdminPage";
			} else {
				model.addAttribute("error", "invalid details");
				return "loginPage";
			}
		} else {
			model.addAttribute("error", "Please enter the details");
			return "loginPage";

		}
	}

	@RequestMapping(value = "/user")
	public String showUsers(Model m) {
		
		return "userView";
	}
	@RequestMapping(value = "/trainingshoes")
	public String showTshoes(Model m) {
		
		return "trainingshoes";
	}
	@RequestMapping(value = "/runningshoes")
	public String showRshoes(Model m) {
		
		return "runningshoes";
	}
	@RequestMapping(value = "/sneakers")
	public String showSneakers(Model m) {
		
		return "sneakers";
	}

}
