package compositionDesignPattern;

public class Bathroom {

    private String color;
    private Tub bathtub;

    public Bathroom(String color) {
        this.color = color;
        bathtub = new Tub(35);
        bathtub.getBubbleColor();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Tub getBathtub() {
        return bathtub;
    }

    public void setBathtub(Tub bathtub) {
        this.bathtub = bathtub;
    }
}
