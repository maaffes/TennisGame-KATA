package com;

import java.util.List;

/**
 * 
 * @author affes
 *
 */

public class TennisGame {

	/**
	 * 
	 * @param list
	 * @return game winner
	 */
	public static String getWinner(List<Integer> list) {
		String score = "";
		int player1 = 0;
		int player2 = 0;
		for (Integer aa : list) {
			if (aa == 1) {
				if (player1 < 30) {
					player1 += 15;
				} else if (player1 == 30) {
					player1 += 10;
				} else if (player1 >= 40) {
					if (player1 == player2) {
						player1 += 1;
					} else {
						score = "player1:40+AD player2:" + player2;
					}
				}
			} else {
				if (player2 < 30) {
					player2 += 15;
				} else if (player2 == 30) {
					player2 += 10;
				} else if (player2 >= 40) {
					if (player1 == player2) {
						player2 = 40 + 1;
					} else {
						score = "player1:" + player1 + " player2:40+AD";
					}
				}
			}

		}
		return score;
	}

	/**
	 * 
	 * @param list
	 * @return set winner
	 */
	public static String getWinnerSet(List<Integer> list) {
		String score = "";
		int player1 = 0;
		int player2 = 0;
		for (Integer aa : list) {
			if (aa == 1) {
				if (player1 < 6) {
					player1 += 1;
				} else if (player1 - player2 <= 1) {
					player1 += 1;
				}

			} else {
				if (player2 < 6) {
					player2 += 1;
				} else if (player2 - player1 <= 1) {
					player1 += 1;
				}

			}
			score = "player1:" + player1 + " player2:" + player2;
			if (player1 == 7 || player2 == 7) {
				break;
			}
		}
		return score;
	}

}
