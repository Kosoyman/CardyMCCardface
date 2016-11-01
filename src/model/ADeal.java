package model;

/**
 * Created by Максим on 26-Oct-16.
 */
public abstract class ADeal {

    public void DealToPlayer(Deck c, Player p) {
        Card card=c.GetCard();
        card.Show(true);
        p.DealCard(card);
    }

    public void DealToDealer(Deck c, Dealer d) {
        Card card=c.GetCard();
        card.Show(true);
        d.DealCard(card);
    }

    public void DealHidden(Deck c, Dealer d){
        Card card=c.GetCard();
        card.Show(false);
        d.DealCard(card);
    }
}

