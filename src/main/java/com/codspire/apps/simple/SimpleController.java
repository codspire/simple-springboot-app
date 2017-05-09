package com.codspire.apps.simple;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codspire.apps.simple.model.SimpleModel;

@RestController
@EnableAutoConfiguration
public class SimpleController {

	@RequestMapping("/")
	public SimpleModel index() {
		return new SimpleModel();
	}
}
