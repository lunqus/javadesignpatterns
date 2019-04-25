package commandDesignPattern.model;

import commandDesignPattern.interfaces.Command;

public class MarioDownCommand implements Command {

    private MarioCharacterReciever marioCharacterReciever;

    public MarioDownCommand(MarioCharacterReciever marioCharacterReciever) {
        this.marioCharacterReciever = marioCharacterReciever;
    }

    @Override
    public void execute() {
        marioCharacterReciever.moveDown();
    }
}
