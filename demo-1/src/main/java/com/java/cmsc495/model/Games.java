package com.java.cmsc495.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the games database table.
 * 
 */
@Entity
@Table(name = "games")
@NamedQuery(name = "Game.findAll", query = "SELECT g FROM Game g")
public class Games implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "game_id")
	private Integer gameId;

	@Column(name = "co_op")
	private String coOp;

	private String developer;

	private String genre;

	private String platform;

	private int players;

	private String title;

	@Temporal(TemporalType.DATE)
	private Date year;

	public Games() {
	}

	public Integer getGameId() {
		return gameId;
	}

	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}

	public String getCoOp() {
		return coOp;
	}

	public void setCoOp(String coOp) {
		this.coOp = coOp;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public int getPlayers() {
		return players;
	}

	public void setPlayers(int players) {
		this.players = players;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

}