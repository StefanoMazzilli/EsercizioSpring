package com.example.demo;


import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EsercizioController {
	public EsercizioController() {
		
	}
	@GetMapping("/test1")
	public String MetodoUno() {
		return "Benvenuto nella mia prima applicazione Spring";
	}
	@GetMapping("/test2")
	public String MetodoDue(@RequestParam String id) {
		if (id.equals("1")) {
			return "Benvenuto Utente 1";
		} else if (id.equals("2")) {
			return "Benvenuto Utente 2";
		} else if (id.equals("3")) {
			return "Benvenuto Utente 3";
		} else {
			return "Specifica l'id";
		}
	}
	@PostMapping("/test3")
	public String MetodoTre(@RequestBody Map<String, Object> postDati) {
		return "Ciao, sono " + postDati.get("name") + " " + postDati.get("lastname") + " e ho " + postDati.get("age") + " anni.";
	}
}
