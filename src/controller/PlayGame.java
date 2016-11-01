package controller;

import view.IView;
import model.Game;

public class PlayGame {

  public boolean Play(Game a_game, IView a_view) {
    a_view.DisplayWelcomeMessage();
    
    a_view.DisplayDealerHand(a_game.GetDealerHand(), a_game.GetDealerScore());
    a_view.DisplayPlayerHand(a_game.GetPlayerHand(), a_game.GetPlayerScore());

    if (a_game.IsGameOver())
    {
        a_view.DisplayGameOver(a_game.IsDealerWinner());
    }

    int input = a_view.GetInput();
    
    if (input == a_view.GetPlay())
    {
        a_game.NewGame();
    }
    else if (input == a_view.GetHit())
    {
        a_game.Hit();
    }
    else if (input == a_view.GetStand())
    {
        a_game.Stand();
    }

    return input != a_view.GetQuit();
  }
}