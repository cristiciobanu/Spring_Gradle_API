package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import app.models.Beer;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(Model model) {
    	
    	RestTemplate restTemplate = new RestTemplate();
    	Beer[] lista = restTemplate.getForObject(
				"https://api.punkapi.com/v2/beers/random", Beer[].class);
    	
        model.addAttribute("info", lista[0]);
        return "greeting";
    }

}
