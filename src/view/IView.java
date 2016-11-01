package view;

public interface IView
{
  char play = 'p';
  char hit = 'h';
  char stand = 's';
  char quit = 'q';

  void DisplayWelcomeMessage();
  int GetInput();
  void DisplayCard(model.Card a_card);
  void DisplayPlayerHand(Iterable<model.Card> a_hand, int a_score);
  void DisplayDealerHand(Iterable<model.Card> a_hand, int a_score);
  void DisplayGameOver(boolean a_dealerIsWinner);
  char GetPlay();
  char GetHit();
  char GetStand();
  char GetQuit();
}