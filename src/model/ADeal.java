package model;

/**
 * Created by Максим on 26-Oct-16.
 */
public abstract class ADeal {

    public void DealtoPLayer(Card c, Dealer d) {
        c.Show(true);
        d.DealCard(c);
    }
}

