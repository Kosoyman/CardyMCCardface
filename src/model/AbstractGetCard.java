package model;

/**
 * Created by Максим on 06-Nov-16.
 */
public abstract class AbstractGetCard {

    public static Card GetCard(Deck a_deck, boolean show) {
        Card c;
        c = a_deck.GetCard();
        c.Show(show);
        return c;
    }
}

