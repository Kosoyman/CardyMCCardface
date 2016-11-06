package model.rules;

import model.*;

class AmericanNewGameStrategy  implements INewGameStrategy  {

    public boolean NewGame(Deck a_deck, Dealer a_dealer, Player a_player) {
        Card c = AbstractGetCard.GetCard(a_deck, true);
        a_player.DealCard(c);
        c = AbstractGetCard.GetCard(a_deck, true);
        a_dealer.DealCard(c);
        c = AbstractGetCard.GetCard(a_deck, true);
        a_player.DealCard(c);
        c = AbstractGetCard.GetCard(a_deck, false);
        a_dealer.DealCard(c);
        return true;
    }
}