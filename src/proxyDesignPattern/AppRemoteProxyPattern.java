package proxyDesignPattern;

public class AppRemoteProxyPattern {

    public static void main(String[] args) {

        Bank bank = new ProxyBank();


        try {

            bank.withdrawMoney("Paulo");
            bank.withdrawMoney("@xmil.com");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
