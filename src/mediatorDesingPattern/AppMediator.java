package mediatorDesingPattern;

public class AppMediator {

    public static void main(String[] args) {

        ATCMediator mediator = new ATCMediatorImpl();

        // Create a few aircarfts
        Aircraft boeing1 = new AircraftImpl(mediator, "Boeing 1");
        Aircraft helicopter = new AircraftImpl(mediator, "Helicopter");
        Aircraft boeing707 = new AircraftImpl(mediator, "Boeing 707");

        // Adding aiarcrafts to the mediator
        mediator.addAircraft(boeing1);
        mediator.addAircraft(helicopter);
        mediator.addAircraft(boeing707);

        boeing1.send("Hello from Boeing 1");
    }
}
