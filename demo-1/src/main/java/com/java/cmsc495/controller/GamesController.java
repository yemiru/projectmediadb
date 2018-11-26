package com.java.cmsc495.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.cmsc495.model.Games;
import com.java.cmsc495.service.GamesService;

@RestController
public class GamesController {
	
	@Autowired
	private GamesService gamesService;

	@RequestMapping(method = RequestMethod.GET, value = "/games")
	public List<Games> getAllGames() {
		return gamesService.getAllGames();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/game/{id}")
	public Games getGame(@pathVariable Integer id) {
		return gamesService.getGame(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/games")
	public void addGame(@RequestBody Games game) {
		gamesService.addGames(game);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/game/{id}")
	public void updateGame(@RequestBody Games game, @pathVariable Integer id) {
		gamesService.updateGames(id,game);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/game/{id}")
	public void deleteGame(@pathVariable Integer id) {
		gamesService.deleteGames(id);
	}
}
