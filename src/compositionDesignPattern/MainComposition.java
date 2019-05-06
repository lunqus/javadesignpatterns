package compositionDesignPattern;

public class MainComposition {

    public static void main(String[] args) {

        Tub tub = new Tub(13);
        Bathroom bath = new Bathroom("Yelow");
        System.out.println(tub.getSize() + " " + tub.getBubbleColor());
        System.out.println(bath.getColor() + " " + bath.getBathtub().getSize());

    }
}
