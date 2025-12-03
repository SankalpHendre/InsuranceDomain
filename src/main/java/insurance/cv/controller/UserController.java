package insurance.cv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController{
	@GetMapping("/")
	public String home() {
		return "Welcome to home page";
	}
}