package com.java.cmsc495.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.cmsc495.model.Video;
import com.java.cmsc495.repositories.VideoRepository;

@RestController
public class VideoController {
	
	
	@Autowired
	private VideoRepository videoRepository;
	
	@RequestMapping(method=RequestMethod.GET,value="/videos/id")
	public List<Video> getAllVideos(@pathVariable Integer id) {
		
		Video obj = new Video();
		obj.setVideoId(id);
		return (List<Video>) videoRepository.findAll();
	}	

}
