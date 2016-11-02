package model.rules;

import model.Player;

/**
 * Created by jani on 2016. 11. 01..
 */
public interface IGameWonStrategy {

    boolean dealerWon(Player a_player, Player a_dealer, int maxScore);
}
