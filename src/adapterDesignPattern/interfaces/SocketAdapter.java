package adapterDesignPattern.interfaces;

import adapterDesignPattern.model.Volt;

public interface SocketAdapter {

    // public Volt get220Volts();

    Volt get120Volts();
    Volt get12Volts();
    Volt get3Volts();
    Volt get1Volt();
}
