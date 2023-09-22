package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@PostMapping ("/getData")
	public MyResponse getData(@RequestBody MyRequest request){
		double ch1 = request.getCh1();
		double ch2 = request.getCh2();

		MyResponse response = new MyResponse();
		response.setRes(ch1*ch2);
		return  response;
	}
}