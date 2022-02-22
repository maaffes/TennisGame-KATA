package com;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		for (Integer value : list) {
			if (value == 1) {
				player1 = getPoint(player1);
			} else {
				player2 = getPoint(player2);
			}
			if ((player2 > 40 || player1 > 40) && Math.abs(player1 - player2) >= 2) {
               if(player1 > 40 && player1<player2) player1=40;
               if(player2 > 40 && player1>player2) player2=40;
				return player2 < player1  ? "player1:40+AD player2:" + player2
						: "player1:" + player1 + " player2:40+AD";

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
		for (Integer value : list) {
			if (value == 1) {
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
				return score;
			}
		}
		return score;
	}

	public static int getPoint(int point) {
		if (point < 30) {
			point += 15;
		} else if (point == 30) {
			point += 10;
		} else {
			point += 1;
		}
		return point;

	}
}
