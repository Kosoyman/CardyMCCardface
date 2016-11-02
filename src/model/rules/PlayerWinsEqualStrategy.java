package model.rules;

import model.Player;

/**
 * Created by jani on 2016. 11. 01..
 */
public class PlayerWinsEqualStrategy implements IGameWonStrategy {


    public boolean dealerWon(Player a_player, Player a_dealer, int maxScore) {
        int playerScore = a_player.CalcScore();
        int dealerScore = a_dealer.CalcScore();

        //score is even
        if (playerScore == dealerScore && playerScore < maxScore) {
            return false;
        }
        //total score is under max, and player has more
        else if (playerScore < maxScore && dealerScore < maxScore && playerScore > dealerScore) {
            return false;
        }
        //total score is under max, and dealer has more
        else if (playerScore < maxScore && dealerScore < maxScore && playerScore < dealerScore) {
            return true;
        }
        //player went bust
        else if (playerScore > maxScore) {
            return true;
        }
        //dealer went bust
        else if (dealerScore > maxScore) {
            return false;
        }
        else {
            return false;
        }
    }
}
