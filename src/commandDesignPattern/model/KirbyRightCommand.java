package commandDesignPattern.model;

import commandDesignPattern.interfaces.Command;

public class KirbyRightCommand implements Command {

    private KirbyCharacterReceiver kirbyCharacterReceiver;

    public KirbyRightCommand(KirbyCharacterReceiver kirbyCharacterReceiver) {
        this.kirbyCharacterReceiver = kirbyCharacterReceiver;
    }

    @Override
    public void execute() {
        kirbyCharacterReceiver.moveRight();
    }
}
