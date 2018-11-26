package com.java.cmsc495.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VideoTest {

	Video video;
	
	@Before
	public void setUp() throws Exception {
		video = new Video();
		video.setGenre("action");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetFormat() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFormat() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGenre() {
		assertTrue(video.getGenre().equals("action"));
	}

	@Test
	public void testSetGenre() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetId() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetId() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStudio() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetStudio() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTitle() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTitle() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetVideoId() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetVideoId() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetYear() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetYear() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPerson() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPerson() {
		fail("Not yet implemented");
	}

}
