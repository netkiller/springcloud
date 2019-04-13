package cn.netkiller.oauth2.client;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/")
	public String email(Principal principal) {
		return "Hello " + principal.getName();
	}
}
