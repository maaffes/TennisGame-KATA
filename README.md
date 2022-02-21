# TennisGame-KATA

SPRINT1 : manage a tennis GAME within a set of a tennis match

 User Story 1 :

As a tennis referee

I want to manage the score of a game of a set of a tennis match between 2 players with simple Game rules
In order to display the current Game score of each player
 
Rules details:
·         The game starts with a score of 0 point for each player
·         Each time a player win a point, the Game score changes as follow:
0 -> 15 -> 30 -> 40-> Win game


SPRINT2 : manage a Tennis SET within a tennis match

User Story 1 :
              As a tennis referee
I want to manage the score of a set of a tennis match between 2 players
In order to display the current Game (SPRINT 1) & Set score of each player
 
Rules details:
·         The set starts with a score of 0 Game for each player
·         Each time a player win a Game (see SPRINT 1), the Set score changes as follow:
1 -> 2 -> 3 -> 4 -> 5 -> 6 (-> 7)
·         If a player reach the Set score of 6 and the other player has a Set score of 4 or lower, the player win the Set
·         If a player wins a Game and reach the Set score of 6 and the other player has a Set score of 5, a new Game must be played and the first player who reach the score of 7 wins the match
