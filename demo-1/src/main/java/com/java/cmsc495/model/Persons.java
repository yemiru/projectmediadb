package com.java.cmsc495.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the persons database table.
 * 
 */
@Entity
@Table(name="persons")
@NamedQuery(name="Person.findAll", query="SELECT p FROM Person p")
public class Persons implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="person_id")
	private int personId;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	private String occupation;

	//bi-directional many-to-one association to Book
	@OneToMany(mappedBy="person")
	private List<Books> books;

	//bi-directional many-to-one association to Music
	@OneToMany(mappedBy="person")
	private List<Music> musics;

	//bi-directional many-to-one association to Video
	@OneToMany(mappedBy="person")
	private List<Video> videos;

	public Persons() {
	}

	public int getPersonId() {
		return this.personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public List<Books> getBooks() {
		return this.books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}

	public Books addBook(Books book) {
		getBooks().add(book);
		book.setPerson(this);

		return book;
	}

	public Books removeBook(Books book) {
		getBooks().remove(book);
		book.setPerson(null);

		return book;
	}

	public List<Music> getMusics() {
		return this.musics;
	}

	public void setMusics(List<Music> musics) {
		this.musics = musics;
	}

	public Music addMusic(Music music) {
		getMusics().add(music);
		music.setPerson(this);

		return music;
	}

	public Music removeMusic(Music music) {
		getMusics().remove(music);
		music.setPerson(null);

		return music;
	}

	public List<Video> getVideos() {
		return this.videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	public Video addVideo(Video video) {
		getVideos().add(video);
		video.setPerson(this);

		return video;
	}

	public Video removeVideo(Video video) {
		getVideos().remove(video);
		video.setPerson(null);

		return video;
	}

}