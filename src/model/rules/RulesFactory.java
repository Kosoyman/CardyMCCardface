package model.rules;

public class RulesFactory {

  public IHitStrategy GetHitRule() {
    return new Soft17HitStrategy();
  }

  public INewGameStrategy GetNewGameRule() {
    return new AmericanNewGameStrategy();
  }

  public IGameWonStrategy GetGameWonStrategy() {
    return new PlayerWinsEqualStrategy();
  }
}