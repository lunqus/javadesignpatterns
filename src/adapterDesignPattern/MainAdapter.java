package adapterDesignPattern;

import adapterDesignPattern.interfaces.iSocketAdapter;
import adapterDesignPattern.model.Socket;
import adapterDesignPattern.model.SocketAdapterImplementation;
import adapterDesignPattern.model.SocketObjectAdapterImplementation;
import adapterDesignPattern.model.Volt;


public class MainAdapter {

    public static void main(String[] args) {

        Socket socket = new Socket();
        System.out.println(socket.getVolt().getVolts());

        Volt volt = new Volt(220);
        System.out.println(volt.getVolts());

        SocketAdapterImplementation sai = new SocketAdapterImplementation();
        System.out.println(sai.get12Volts().getVolts());
        System.out.println(sai.get1Volt().getVolts());

        testingObjectAdapter();
        testingClassAdapter();
    }

    private static void testingClassAdapter() {
        iSocketAdapter socketAdapter = new SocketAdapterImplementation();
        Volt v1 = getVolt(socketAdapter, 1);
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.println("V1 volts is using Class Adapter " + v1.getVolts());
        System.out.println("V3 volts is using Class Adapter " + v3.getVolts());
        System.out.println("V12 volts is using Class Adapter " + v12.getVolts());
        System.out.println("V120 volts is using Class Adapter " + v120.getVolts());
    }

    private static void testingObjectAdapter() {
        iSocketAdapter socketAdapter = new SocketObjectAdapterImplementation();
        Volt v1 = getVolt(socketAdapter, 1);
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.println("V1 volts is using Object Adapter " + v1.getVolts());
        System.out.println("V3 volts is using Object Adapter " + v3.getVolts());
        System.out.println("V12 volts is using Object Adapter " + v12.getVolts());
        System.out.println("V120 volts is using Object Adapter " + v120.getVolts());
    }

    private static Volt getVolt(iSocketAdapter socketAdapter, int i) {
        switch (i) {
            case 1: return socketAdapter.get1Volt();
            case 3: return socketAdapter.get3Volts();
            case 12: return socketAdapter.get12Volts();
            case 120: return socketAdapter.get120Volts();
            default: return socketAdapter.get120Volts();
        }
    }
}
