package edu.oakland.springtest.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.oakland.springtest.data.Person;

@Controller
@RequestMapping("/")
public class TestController {

	@RequestMapping(method = { RequestMethod.GET, RequestMethod.POST })
	public String getHome() {
		return "home";
	}

	@RequestMapping(value = "/user", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String getUser() {
		return "user";
	}

	@RequestMapping(value = "/getPersons", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Person> getAllPersons() {
		Person p1 = new Person();
		p1.setAddress("michigan");
		p1.setAge(23);
		p1.setFirstname("kusu");
		p1.setLastname("adhikari");

		Person p2 = new Person();
		p2.setAddress("Oaklohma");
		p2.setAge(19);
		p2.setFirstname("Kishor");
		p2.setLastname("adhikari");

		return Arrays.asList(p1, p2);

	}
}
