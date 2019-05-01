package templateDesignPattern;

public class FootballGame extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game initializing ...");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game starts playing ...");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game ending ...");
    }
}