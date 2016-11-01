package controller;

import model.CardDealtObserver;
import view.IView;
import model.Game;

import java.util.ArrayList;

public class PlayGame  {


  public boolean Play(Game a_game, IView a_view) {
    a_view.DisplayWelcomeMessage();

    a_view.DisplayDealerHand(a_game.GetDealerHand(), a_game.GetDealerScore());
    a_view.DisplayPlayerHand(a_game.GetPlayerHand(), a_game.GetPlayerScore());

    if (a_game.IsGameOver()) {
      a_view.DisplayGameOver(a_game.IsDealerWinner());

    }
  return true;}

}