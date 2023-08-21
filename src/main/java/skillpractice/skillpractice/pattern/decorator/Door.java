package skillpractice.skillpractice.pattern.decorator;

import skillpractice.skillpractice.pattern.decorator.car.Car;

public class Door extends ComponentDecorator {

    public Door(Car car){
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Door";
    }

    @Override
    public double cost() {
        return car.cost() + 1000;
    }

}
