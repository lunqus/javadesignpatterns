package commandDesignPattern.model;

import commandDesignPattern.interfaces.Command;

public class MarioLeftCommand implements Command {

    private MarioCharacterReciever marioCharacterReciever;

    public MarioLeftCommand(MarioCharacterReciever marioCharacterReciever) {
        this.marioCharacterReciever = marioCharacterReciever;
    }

    @Override
    public void execute() {
        marioCharacterReciever.moveLeft();
    }
}
