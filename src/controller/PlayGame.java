package controller;

import model.Card;
import model.CardDealtObserver;
import view.IView;
import model.Game;

public class PlayGame implements CardDealtObserver {
  private IView theView;
  private Game theGame;

  public PlayGame(IView a_view, Game a_game){
    theView = a_view;
    theGame=a_game;
    a_game.getDealer().addSub(this);
  }

  public boolean Play() {
    theView.DisplayWelcomeMessage();
    theView.DisplayDealerHand(theGame.GetDealerHand(), theGame.GetDealerScore());
    theView.DisplayPlayerHand(theGame.GetPlayerHand(), theGame.GetPlayerScore());

    if (theGame.IsGameOver())
    {
      theView.DisplayGameOver(theGame.IsDealerWinner());
    }

    int input = theView.GetInput();

    if (input == theView.GetPlay())
    {
      theGame.NewGame();
    }
    else if (input == theView.GetHit())
    {
      theGame.Hit();
    }
    else if (input == theView.GetStand())
    {
      theGame.Stand();
    }

    return input != theView.GetQuit();
  }

  @Override
  public void CardDealt(Card theCard) {
    try {
      Thread.sleep(1500);
    } catch (Exception e) {
    }
    theView.DisplayCard(theCard);
    try {
      Thread.sleep(1500);
    } catch (Exception e) {
    }
  }
}
