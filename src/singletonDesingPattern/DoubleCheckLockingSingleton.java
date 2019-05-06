package singletonDesingPattern;

public class DoubleCheckLockingSingleton {

    private volatile static DoubleCheckLockingSingleton uniqueDCLInstance;

    private DoubleCheckLockingSingleton() {
    }

    // Double-Check locking
    public static DoubleCheckLockingSingleton getInstance() {
        if(uniqueDCLInstance == null) {
            synchronized ((DoubleCheckLockingSingleton.class)) {
                if(uniqueDCLInstance == null) {
                    uniqueDCLInstance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return uniqueDCLInstance;
    }
}
