package com.singtel.test.after.optimize;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class BirdTest {

	private Bird bird;
	private PrintStream printStream;
	private ByteArrayOutputStream byteArrayOutputStream;

	@Before
	public void setUp() throws Exception {
		bird = new Bird();
		byteArrayOutputStream = new ByteArrayOutputStream();
		printStream = new PrintStream(byteArrayOutputStream);
		System.setOut(printStream);
		bird = new Bird();

	}

	@Test
	public final void testFly() {
		bird.fly();
		assertTrue("I am flying".contains(byteArrayOutputStream.toString().trim()));
	}

	@Test
	public final void testSing() {
		bird.sing();
		assertTrue("I am Singing".contains(byteArrayOutputStream.toString().trim()));
	}

	@Test
	public final void testWalk() {
		bird.walk();
		assertTrue("I am walking".contains(byteArrayOutputStream.toString().trim()));
	}

}
