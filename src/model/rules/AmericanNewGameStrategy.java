package model.rules;

import model.*;

class AmericanNewGameStrategy extends ADeal implements INewGameStrategy  {

  public boolean NewGame(Deck a_deck, Dealer a_dealer, Player a_player) {
    DealToPlayer(a_deck,a_player);

    DealToDealer(a_deck,a_dealer);

    DealToPlayer(a_deck,a_player);
    DealHidden(a_deck,a_dealer);

    return true;
  }
}