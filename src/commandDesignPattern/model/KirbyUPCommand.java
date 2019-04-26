package commandDesignPattern.model;

import commandDesignPattern.interfaces.Command;

public class KirbyUPCommand implements Command {

    private KirbyCharacterReceiver kirbyCharacterReceiver;

    public KirbyUPCommand(KirbyCharacterReceiver kirbyCharacterReceiver) {
        this.kirbyCharacterReceiver = kirbyCharacterReceiver;
    }

    @Override
    public void execute() {
        kirbyCharacterReceiver.moveUp();
    }
}
