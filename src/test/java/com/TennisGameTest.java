package com;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
/**
 * 
 * @author affes
 *
 */
public class TennisGameTest {
	
	@Test
	public void ShouldReturnP1WinnerGameIfEqual(){
		// list points p1 vs p2
		List<Integer> listPoints = Arrays.asList(1,2,1,2,2,1,2,1,1,1);
		String expected = "player1:40+AD player2:40";		
		String actual=TennisGame.getWinner(listPoints);		
		assertEquals(expected,actual);
	}
	
	@Test
	public void ShouldReturnP2WinnerGameIfEqual(){
		List<Integer> listPoints = Arrays.asList(1,2,1,2,2,1,1,2,2,2);
		String expected = "player1:40 player2:40+AD";		
		String actual=TennisGame.getWinner(listPoints);		
		assertEquals(expected,actual);
	}
	@Test
	public void ShouldReturnP2WinnerGameIfNotEqual(){
		List<Integer> listPoints = Arrays.asList(2,2,1,2,2,1,2,1,1,1);
		String expected = "player1:15 player2:40+AD";		
		String actual=TennisGame.getWinner(listPoints);		
		assertEquals(expected,actual);
	}
	@Test
	public void ShouldReturnP1WinnerGameIfNotEqual(){
		List<Integer> listPoints = Arrays.asList(1,1,1,2,1,1,2,1,1,1);
		String expected = "player1:40+AD player2:15";		
		String actual=TennisGame.getWinner(listPoints);		
		assertEquals(expected,actual);
	}
	
	@Test
	public void ShouldReturnWinnerGameIfNotEqual(){
		List<Integer> listPoints = Arrays.asList(1,2,1,2,1,1,1);
		String expected = "player1:40+AD player2:30";
		String actual=TennisGame.getWinner(listPoints);		
		assertEquals(expected,actual);
	}
	
	@Test
	public void ShouldReturnWinnerSetIfEqual(){
		List<Integer> listPoints = Arrays.asList(1,1,1,2,1,1,2,2,2,2,1,2,1,2,1);
		String expected = "player1:7 player2:6";
		String actual=TennisGame.getWinnerSet(listPoints);		
		assertEquals(expected,actual);
	}
	@Test
	public void ShouldReturnWinnerSetIfNotEqual(){
		List<Integer> listPoints = Arrays.asList(1,1,1,2,1,1,2,1,1);
		String expected = "player1:6 player2:2";
		String actual=TennisGame.getWinnerSet(listPoints);		
		assertEquals(expected,actual);
	}

}
