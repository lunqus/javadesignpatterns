package templateDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EndlessRunnerGame extends Game {

    @Override
    void initialize() {
        System.out.println("Endless Runner initializing ...");
    }

    @Override
    void startPlay() {
        System.out.println("Endless Runner starts playing ...");
        playerWantsNewCharacer();
    }

    @Override
    void endPlay() {
        System.out.println("Endless Runner ending ...");
    }

    @Override
    protected void addCharacterTotheGame() {
        System.out.println("Adding new Character to the game");
    }

    public boolean playerWantsNewCharacer() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {

        String answer = null;
        System.out.println("Would you like to add new character to the game (y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        } catch (IOException ioe) {
            System.out.println("IO Error: " + ioe);
        }
        if (answer == null) {
            return "No";
        }
        return answer;
    }

    // Add more methods if needed
}
