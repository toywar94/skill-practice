package skillpractice.skillpractice.pattern.decorator;

import skillpractice.skillpractice.pattern.decorator.car.Car;

public abstract class ComponentDecorator extends Car {

    Car car;

    public abstract String getDescription();

}
