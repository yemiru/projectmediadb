package com.java.cmsc495.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.java.cmsc495.model.Games;

@Service
public class GamesService {
	
	private List<Games> games = new ArrayList<Games>();
	public List<Games> getAllGames() {
		return games;

	}

	public Games getGame(Integer id) {
		return games.stream().filter(g -> g.getGameId().equals(id)).findFirst().get();
	}

	public void addGames(Games game) {
		games.add(game);

	}

	//this methos should reviesed based on the requirement
	public void updateGames(Integer id, Games game) {
			for(int i = 0; i <games.size(); i++) {
				Games g = games.get(i);
				if(g.getGameId().equals(id)) {
					g = game;
					return ;
				}
			}
			
		}

	public void deleteGames(Integer id) {
			games.removeIf(g -> g.getGameId().equals(id));
			
		}

}



