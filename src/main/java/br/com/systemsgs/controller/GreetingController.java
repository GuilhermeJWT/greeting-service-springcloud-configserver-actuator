package br.com.systemsgs.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.systemsgs.configuration.GreetingConfiguration;
import br.com.systemsgs.model.ModelGreeting;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {
	
	private static final String template = " %s, %s";
	private final AtomicLong contador = new AtomicLong();
	
	@Autowired
	private GreetingConfiguration configuration;
	
	public ModelGreeting greeting (@RequestParam(value = "name", defaultValue = "") String name) {
		
		if(name.isEmpty()) {
			name = configuration.getDefaultValue();
		}
		
		return new ModelGreeting(contador.incrementAndGet(), String.format(template, configuration.getGreeting()));
	}

}
