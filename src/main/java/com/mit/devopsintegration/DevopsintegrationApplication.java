package com.mit.devopsintegration;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsintegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsintegrationApplication.class, args);
	}

	@GetMapping(value = "/")
	public List<String> findAllEmployee(){
		return Arrays.asList("Ram","Shyam","Jam");
	}
}
