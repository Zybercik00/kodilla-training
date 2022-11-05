package com.kodilla.good.patterns.challenges.food2door;

public class Application {

    public static void main(String[] args) {

        InformationSerivce informationSerivce = new InformationSerivce();
        Food2Door food2Door = new Food2Door(informationSerivce);

        food2Door.addProducer(new ExtraFoodShop());
        food2Door.addProducer(new GlutenFreeShop());
        food2Door.addProducer(new HealthyShop());
        food2Door.addProducer(new WiejskaZagrodaShop());
        food2Door.addProducer(new AquaShop());

        Order order = new Order("Mleczko kokosowe", 5);

        food2Door.handle(order, "GlutenFreeShop");

    }
}
