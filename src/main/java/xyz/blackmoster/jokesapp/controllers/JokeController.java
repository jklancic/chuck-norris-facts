package xyz.blackmoster.jokesapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import xyz.blackmoster.jokesapp.models.Funny;
import xyz.blackmoster.jokesapp.services.JokeService;

@Controller
public class JokeController {
	
	private JokeService jokeService;

	@Autowired
	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/", ""})
	public String getRandomChuckNorrisFact(Model model) {
		Funny funny = new Funny(jokeService.getRandomChuckNorrisFact());
		model.addAttribute("funny", funny);
		return "chucknorris";
	}
}
