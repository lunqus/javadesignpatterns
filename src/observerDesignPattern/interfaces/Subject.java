package observerDesignPattern.interfaces;

public interface Subject {
    public void register(Observer observer);
    public void unregister(Observer observer);

    public void notifyObservers();

    // Get & Update methods going to return objects
    // Object - generic Object cuold be any type of object
    public Object getUpdate(Observer observer);
}
