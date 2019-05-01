package templateDesignPattern;

public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // Template method
    public final void play() {
        loadAssets();
        initialize();
        startPlay();
        if(addNewGameCharacter()) {
            addCharacterTotheGame();
        }
        endPlay();
    }

    // Hooked on Template Method
    protected abstract void addCharacterTotheGame();

    void loadAssets() {
        System.out.println("Loadig Game Assets!");
    }

    boolean addNewGameCharacter() {
        return true;
    }

}
