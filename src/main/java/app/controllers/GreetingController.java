package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import app.services.ApiCallObject;
import app.services.ApiCallObjects;
import app.utils.GlobalProperties;

@Controller
public class GreetingController {
	
	  @RequestMapping("/greeting")
	  public String weather(Model model) {
		  
		  UriComponents urlCams = UriComponentsBuilder.newInstance()
			      .scheme("http").host(GlobalProperties.getCamsHost()).path(GlobalProperties.getCamsPath()).build();
		  
		  ApiCallObjects x = new ApiCallObjects(urlCams.toString());
		  model.addAttribute("infoCams", x.getResult());
		  
		  UriComponents urlWeather = UriComponentsBuilder.newInstance()
			      .scheme("https").host(GlobalProperties.getWeatherHost()).path(GlobalProperties.getWeatherPath())
			      .queryParam("appid", "68e66ece6cffc81f9c4eff0785619286").queryParam("q", "london")
			      .build();
		  
		  ApiCallObject y = new ApiCallObject(urlWeather.toString());
	      model.addAttribute("infoWeather", y.getResult());
	      
	      return "greeting";
	  }
	  
}
