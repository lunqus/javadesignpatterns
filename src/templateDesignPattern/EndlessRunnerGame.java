package templateDesignPattern;

public class EndlessRunnerGame extends Game {

    @Override
    void initialize() {
        System.out.println("Endless Runner initializing ...");
    }

    @Override
    void startPlay() {
        System.out.println("Endless Runner starts playing ...");
    }

    @Override
    void endPlay() {
        System.out.println("Endless Runner ending ...");
    }

    // Add more methods if needed
}
