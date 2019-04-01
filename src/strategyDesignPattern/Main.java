package strategyDesignPattern;

import strategyDesignPattern.controller.ScoreBoard;
import strategyDesignPattern.model.Ballon;
import strategyDesignPattern.model.Clown;
import strategyDesignPattern.model.SquareBallon;

public class Main {

    public static void main(String[] args) {

        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.print("Balloon Tap Score: ");
        scoreBoard.algorithmBase = new Ballon();
        scoreBoard.showScore(10, 5);

        System.out.print("Balloon Tap Score: ");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10, 5);

        System.out.print("Square Balloon Score: ");
        scoreBoard.algorithmBase = new SquareBallon();
        scoreBoard.showScore(10, 5);

    }
}
