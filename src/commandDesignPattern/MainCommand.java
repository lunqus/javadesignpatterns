package commandDesignPattern;

import commandDesignPattern.model.*;

public class MainCommand {

    public static void main(String[] args) {

        // Create receivers
        MarioCharacterReciever mario = new MarioCharacterReciever();
        mario.setName("Mario");

        KirbyCharacterReceiver kirby = new KirbyCharacterReceiver();
        kirby.setName("Kirby");

        // Create commands
        MarioUpCommand marioUpCommand = new MarioUpCommand(mario);
        MarioDownCommand marioDownCommand = new MarioDownCommand(mario);
        MarioLeftCommand marioLeftCommand = new MarioLeftCommand(mario);
        MarioRightCommand marioRightCommand = new MarioRightCommand(mario);

        KirbyUPCommand kirbyUPCommand = new KirbyUPCommand(kirby);
        KirbyDownCommand kirbyDownCommand = new KirbyDownCommand(kirby);
        KirbyLeftCommand kirbyLeftCommand = new KirbyLeftCommand(kirby);
        KirbyRightCommand kirbyRightCommand = new KirbyRightCommand(kirby);

        // Invoker --> Mario
        GameBoy gameBoyMario = new GameBoy(marioUpCommand, marioDownCommand, marioLeftCommand, marioRightCommand);
        gameBoyMario.arrowDown();

        // Invoker --> Kirby
        GameBoy gameBoyKirby = new GameBoy(kirbyUPCommand, kirbyDownCommand, kirbyLeftCommand, kirbyRightCommand);
        gameBoyKirby.arrowRight();

    }
}
