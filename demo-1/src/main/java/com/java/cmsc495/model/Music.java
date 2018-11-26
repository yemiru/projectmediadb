package com.java.cmsc495.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the music database table.
 * 
 */
@Entity
@NamedQuery(name = "Music.findAll", query = "SELECT m FROM Music m")
public class Music implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "music_id")
	private int musicId;

	private String album;

	private String genre;

	private String song;

	// bi-directional many-to-one association to Person
	@ManyToOne
	@JoinColumn(name = "artist_id")
	private Persons person;

	public Music() {
	}

	public Integer getMusicId() {
		return musicId;
	}

	public void setMusicId(Integer musicId) {
		this.musicId = musicId;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public Persons getPerson() {
		return this.person;
	}

	public void setPerson(Persons person) {
		this.person = person;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Music get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}