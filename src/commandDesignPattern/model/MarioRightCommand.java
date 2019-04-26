package commandDesignPattern.model;

import commandDesignPattern.interfaces.Command;

public class MarioRightCommand implements Command {

    private MarioCharacterReciever marioCharacterReciever;

    public MarioRightCommand(MarioCharacterReciever marioCharacterReciever) {
        this.marioCharacterReciever = marioCharacterReciever;
    }

    @Override
    public void execute() {
     marioCharacterReciever.moveRight();
    }
}
