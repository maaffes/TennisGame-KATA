package com;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
/**
 * 
 * @author VO2GROUP
 *
 */
public class TennisGameTest {
	
	@Test
	public void ShouldReturnWinnerGameIfEqual(){
		List<Integer> list = Arrays.asList(1,2,1,2,2,1,1,2,1,1);
		String score = "player1:40+AD player2:40";		
		String actual=TennisGame.getWinner(list);		
		assertEquals(score,actual);
	}
	
	@Test
	public void ShouldReturnWinnerGameIfNotEqual(){
		List<Integer> list = Arrays.asList(1,2,1,2,1,1,1);
		String score = "player1:40+AD player2:30";
		String actual=TennisGame.getWinner(list);		
		assertEquals(score,actual);
	}
	
	@Test
	public void ShouldReturnWinnerSetIfEqual(){
		List<Integer> list = Arrays.asList(1,1,1,2,1,1,2,2,2,2,1,2,1,2,1);
		String score = "player1:7 player2:6";
		String actual=TennisGame.getWinnerSet(list);		
		assertEquals(score,actual);
	}
	@Test
	public void ShouldReturnWinnerSetIfNotEqual(){
		List<Integer> list = Arrays.asList(1,1,1,2,1,1,2,1,1);
		String score = "player1:6 player2:2";
		String actual=TennisGame.getWinnerSet(list);		
		assertEquals(score,actual);
	}

}
