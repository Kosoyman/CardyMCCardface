import controller.*;
import model.Game;
import view.*;

public class Program {
    public static void main(String[] args) {

        Game g = new Game();
        IView v = new SimpleView(); //new SwedishView();
        PlayGame ctrl = new PlayGame();

        while (ctrl.Play(g, v)) ;
    }

}