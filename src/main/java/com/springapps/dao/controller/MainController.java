package com.springapps.dao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springapps.entity.LoginBean;

@Controller
public class MainController {

	@RequestMapping("/login")
	public String showLoginPage() {
		return "loginPage";
	}

	@RequestMapping(value = "adminlogin", method = RequestMethod.POST)
	public String showAdminPage(Model model, @ModelAttribute("LoginBean")LoginBean loginBean) {
		if(loginBean != null && loginBean.getName()!=null && loginBean.getPassword()!=null) {
			if(loginBean.getName().equals("admin") && loginBean.getPassword().equals("root")) {
				return "AdminPage";
			}
			else {
				model.addAttribute("error", "invalid details");
				return "loginPage";
			}
		}else {
			model.addAttribute("error", "Please enter the details");
			return "loginPage";
			
		}
	}

}
