package commandDesignPattern.model;

import commandDesignPattern.interfaces.Command;

public class MarioUpCommand implements Command {

    private MarioCharacterReciever marioCharacter;

    public MarioUpCommand(MarioCharacterReciever marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacter.moveUp();

    }
}
