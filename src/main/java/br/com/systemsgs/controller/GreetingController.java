package br.com.systemsgs.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.systemsgs.model.ModelGreeting;

@RestController
public class GreetingController {
	
	private static final String template = "Guilherme, %s";
	private final AtomicLong contador = new AtomicLong();
	
	public ModelGreeting greeting (@RequestParam(value = "name", defaultValue = "Nome Gui") String name) {
		return new ModelGreeting(contador.incrementAndGet(), String.format(template, name));
	}

}
