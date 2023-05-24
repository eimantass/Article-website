package lt.codeacademy.learn.naujienos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lt.codeacademy.learn.naujienos.entities.Straipsnis;
import lt.codeacademy.learn.naujienos.service.StraipsnisService;


@Controller
public class HomeController {
	@Autowired
	StraipsnisService straipsnisService;
	
	@GetMapping("/")
	public String showStraipsniaiList(Model model) {
	model.addAttribute("straipsniai", straipsnisService.findAll());
	return "index";
	}
	@GetMapping("/login")
	public String showSignUpForm(Straipsnis straipsnis) {
	return "add-straipsnis";
	}
	@PostMapping("/add-article")
	public String addArticle(Straipsnis straipsnis, BindingResult result, Model model) {
		System.out.println(straipsnisService.save(straipsnis));
		return "redirect:/";
	}
	@GetMapping("/straipsnis/{id}")
	public String showStraipsnis(@PathVariable("id")long id, Model model) {
		Straipsnis straipsnis = straipsnisService.findById(id);
		model.addAttribute("straipsnis",straipsnis);
		return "straipsnis";
	}
	@GetMapping("/update/{id}")
	public String showUpdateForm(@PathVariable("id")long id, Model model) {
		Straipsnis straipsnis = straipsnisService.findById(id);
		model.addAttribute("straipsnis",straipsnis);
		return "update-straipsnis";
	}
	@PostMapping("/update/{id}")
	public String UpdateStraipsnis(@PathVariable("id")long id, Straipsnis straipsnis, Model model) {
		//Straipsnis straipsnis = straipsnisService.findById(id);
		//model.addAttribute("straipsnis",straipsnis);
		straipsnisService.save(straipsnis);
		return "redirect:/";
	}
	@GetMapping("/delete/{id}")
	public String deleteStraipsnisById(@PathVariable("id")long id, Model model) {
	Straipsnis straipsnis = straipsnisService.findById(id);
	straipsnisService.delete(straipsnis);
	return "redirect:/";
	}
	@GetMapping("/Straipsnis/{id}")
	public String showStraipsnis(@PathVariable("id")long id, Straipsnis straipsnis, Model model) {
	return "tekstas";	
	}
}
