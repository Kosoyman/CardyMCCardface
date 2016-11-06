package model.rules;

import model.*;

class InternationalNewGameStrategy  implements INewGameStrategy {

  public boolean NewGame(Deck a_deck, Dealer a_dealer, Player a_player) {

    Card c = AbstractGetCard.GetCard(a_deck, true);
    a_player.DealCard(c);
    c = AbstractGetCard.GetCard(a_deck, true);
    a_dealer.DealCard(c);
    c = AbstractGetCard.GetCard(a_deck, true);
    a_player.DealCard(c);
    return true;
  }
}