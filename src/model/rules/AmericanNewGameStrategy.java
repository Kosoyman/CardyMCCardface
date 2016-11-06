package model.rules;

import model.*;

class AmericanNewGameStrategy  implements INewGameStrategy  {

    public boolean NewGame(Deck a_deck, Dealer a_dealer, Player a_player) {
        a_player.CardFromDeck(a_deck);
        a_dealer.CardFromDeck(a_deck);
        a_player.CardFromDeck(a_deck);
        a_dealer.CardFromDeckHidden(a_deck);
        return true;
    }
}