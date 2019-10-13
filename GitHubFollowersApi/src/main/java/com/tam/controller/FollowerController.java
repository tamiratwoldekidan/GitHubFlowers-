package com.tam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tam.entitiy.User;
import com.tam.service.GitService;

@RestController
@RequestMapping({"/user"})
public class FollowerController {
	@Autowired GitService gitService;
	@RequestMapping(path = "{login}/followers")
	
	public List<User> getFollowers(@PathVariable("login") String login) {
		return gitService.getFollowers(login);
	}
}
