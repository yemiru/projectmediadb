package com.java.cmsc495.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.java.cmsc495.model.Music;

@Service
public class MusicService {
	
	private List<Music> musics = new ArrayList<Music>();
	public List<Music> getAllMusic() {
		return musics;

	}

	public Music getMusic(Integer id) {
		return musics.stream().filter(b -> b.getMusicId().equals(id)).findFirst().get();
	}

	public void addMusic(Music music) {
		musics.add(music);

	}

	//This method should be revised
	public void updateMusic(Integer id, Music music) {
			for(int i = 0; i <music.size(); i++) {
				Music m = music.get(i);
				if(m.getMusicId().equals(id)) {
					//music.set(i, music);
					return ;
				}
			}
			
		}

	 public void deleteMusic(Integer id) {
		 musics.removeIf(m -> m.getMusicId().equals(id));
			
	}
}







