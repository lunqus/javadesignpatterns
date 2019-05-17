package mediatorDesingPattern;

import java.util.ArrayList;
import java.util.List;

public class ATCMediatorImpl implements ATCMediator {

    private List<Aircraft> aircraftList;

    public ATCMediatorImpl() {
        this.aircraftList = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, Aircraft aircraft) {
        for(Aircraft a : aircraftList) {
            // Message should not be received by aircraft sending the message
            if (a != aircraft) {
                a.receive(msg);
            }
        }
    }

    @Override
    public void addAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }
}
