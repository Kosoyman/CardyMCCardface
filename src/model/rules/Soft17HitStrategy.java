package model.rules;

import model.Card;
import model.Player;

/**
 * Created by Максим on 26-Oct-16.
 */
public class Soft17HitStrategy implements IHitStrategy{

    private final int g_hitLimit = 17;

    @Override
    public boolean DoHit(Player a_dealer) {
        if (a_dealer.CalcScore() < g_hitLimit)
            return true;
        else if (a_dealer.CalcScore() == g_hitLimit)
        {
            for (Card c : a_dealer.GetHand())
            {
                if (c.GetValue() == Card.Value.Ace);
                {
                    return true; // TODO: make sure that the score also gets updated accordingly
                }
            }
        }
        return false;
    }
}
