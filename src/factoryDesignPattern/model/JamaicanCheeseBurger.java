package factoryDesignPattern.model;

public class JamaicanCheeseBurger extends Hamburger {

    public JamaicanCheeseBurger() {

        name = "Jamaican Style Cheese Burger";
        sauce = "Spicy Jamaican sauce";
        buns = "Cookie doigh buns!";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Jamaican style ... ");
    }
}
