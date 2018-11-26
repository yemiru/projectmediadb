package com.java.cmsc495.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.cmsc495.model.Books;
import com.java.cmsc495.model.Music;
import com.java.cmsc495.repositories.MusicRepository;
import com.java.cmsc495.service.BooksService;
import com.java.cmsc495.service.MusicService;

@RestController
public class MusicController {
	
	
	@Autowired
	private MusicService musicService;

	@RequestMapping(method = RequestMethod.GET, value = "/music")
	public List<Music> getAllMusic() {
		return musicService.getAllMusic();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/music/{id}")
	public Music getMusic(@pathVariable Integer id) {
		return musicService.getMusic(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/music")
	public void addMusic(@RequestBody Music music) {
		musicService.addMusic(music);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/music/{id}")
	public void updateMusic(@RequestBody Music music, @pathVariable Integer id) {
		musicService.updateMusic(id, music);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/music/{id}")
	public void deleteMusic(@pathVariable Integer id) {
		musicService.deleteMusic(id);
	}
}
