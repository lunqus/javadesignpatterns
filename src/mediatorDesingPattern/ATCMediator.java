package mediatorDesingPattern;

public interface ATCMediator {

    void sendMessage(String msg, Aircraft aircraft);
    void addAircraft(Aircraft aircraft);
}
