package skillpractice.skillpractice.pattern.decorator;


import skillpractice.skillpractice.pattern.decorator.car.Car;

public class Wheel extends ComponentDecorator {

    public Wheel(Car car){
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Wheel";
    }

    @Override
    public double cost() {
        return car.cost() + 200;
    }
}
