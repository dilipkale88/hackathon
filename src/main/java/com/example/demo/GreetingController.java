package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pack.tracker.service.PackageTrackerServiceImpl;

@RestController
public class GreetingController {
	
	private static final String template = "Hello, %s!";
	PackageTrackerServiceImpl packageService = new PackageTrackerServiceImpl();

	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "trackingId", defaultValue = "World") String trackingId) {
		//return new String(counter.incrementAndGet(), String.format(template, name));
		//packageService.getPackageDetails(trackingId);
	return "Welcome "+ trackingId;
	}
}