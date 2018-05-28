package org.zerock.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.UserVO;
import org.zerock.service.UserService;

@Controller
@RequestMapping("/user/")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Inject
	private UserService service;
	
	@RequestMapping(value="/register", method= RequestMethod.GET) 
	public String registerGET() throws Exception {
		logger.info("register get ===================  /0330");
		//model.addAttribute("list", service.listAll()); 
		System.out.println("register get.............. 0330 ");
		return "/user/register";
	}
	
	@RequestMapping(value="/register", method= RequestMethod.POST)
	//public String registerPOST(BoardVO board, Model model) throws Exception {
	public String registerPOST(UserVO user, RedirectAttributes rttr ) throws Exception {
		logger.info("register post =============");
		System.out.println("register post ..........");
		
		service.regist(user);
		rttr.addFlashAttribute("msg", "success"); 
		//model.addAttribute("result", "success");
		return "redirect:/user/listAll"; 

	}
	
	@RequestMapping(value="/listAll", method=RequestMethod.GET)
	public void listAll(Model model) throws Exception {
		logger.info("show all list ==============");
		model.addAttribute("list", service.listAll()); 
		System.out.println(" list all == Ok!! .............");
	}
	
	@RequestMapping(value="/read", method=RequestMethod.GET)
	public void read(@RequestParam("UserID") String UserID, Model model) throws Exception {
		model.addAttribute(service.read(UserID));
		System.out.println("read no = " + UserID + " ok !!! ");			
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public String update(@RequestParam("bno") String UserID, Model model) throws Exception {
		System.out.println("modify call.....................");
		model.addAttribute(service.read(UserID));
		return "/user/modify"; 
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String update(UserVO vo, RedirectAttributes rttr) throws Exception {
		service.modify(vo);
		rttr.addFlashAttribute("msg", "success");
		return "redirect:/user/listAll"; 
	}
	
	@RequestMapping(value="/remove", method=RequestMethod.POST)
	public String remove(@RequestParam("UserID") String UserID, RedirectAttributes rttr) throws Exception {
		service.remove(UserID);
		rttr.addFlashAttribute("msg", "success");
		return "redirect:/user/listAll"; 
	}
}