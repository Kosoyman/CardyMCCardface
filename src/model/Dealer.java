package model;

import model.rules.*;
import java.util.ArrayList;

public class Dealer extends Player {

    Deck m_deck;
    private INewGameStrategy m_newGameRule;
    private IHitStrategy m_hitRule;
    private IGameWonStrategy m_gameWon;
    private ArrayList<CardDealtObserver> subscribers;

    public Dealer(RulesFactory a_rulesFactory) {

        m_newGameRule = a_rulesFactory.GetNewGameRule();
        m_hitRule = a_rulesFactory.GetHitRule();
        m_gameWon = a_rulesFactory.GetGameWonStrategy();
        subscribers=new ArrayList<CardDealtObserver>();
    }

    public void addSub(CardDealtObserver sub) {subscribers.add(sub);}

    public boolean NewGame(Player a_player) {

        if (m_deck == null || IsGameOver()) {
            m_deck = new Deck();
            ClearHand();
            a_player.ClearHand();
            return m_newGameRule.NewGame(m_deck, this, a_player);
        }
        return false;
    }
    public boolean Stand() {
        if (this.m_deck != null)
        {
            this.ShowHand();
            while (this.m_hitRule.DoHit(this)) {
                Card c = this.CardFromDeck(m_deck, true);
                for (CardDealtObserver obs : subscribers) {
                    obs.CardDealt(c);
                }
            }
            return true;
        }return false;}

    public boolean Hit(Player a_player) {
        if (m_deck != null && a_player.CalcScore() < g_maxScore && !IsGameOver()) {
            Card c = a_player.CardFromDeck(m_deck, true);
            for (CardDealtObserver obs : subscribers) {
                obs.CardDealt(c);
            }

            return true;
        }
        return false;
    }

    public boolean IsDealerWinner(Player a_player) {
        //check the game won strategy here to determine winner when the game's over
        return m_gameWon.dealerWon(a_player, this, a_player.g_maxScore);
    }


    public boolean IsGameOver() {
        if (m_deck != null && m_hitRule.DoHit(this) != true) {
            return true;
        }
        return false;
    }

}