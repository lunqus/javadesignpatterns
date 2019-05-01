package facadeDesignPattern;

public class MainFacade {

    public static void main(String[] args) {

        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hd = new HardDrive();

        ComputerFacade cf = new ComputerFacade(cpu, memory, hd);

        cf.start();
    }
}
