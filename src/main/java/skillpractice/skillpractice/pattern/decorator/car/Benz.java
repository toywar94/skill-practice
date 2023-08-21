package skillpractice.skillpractice.pattern.decorator.car;

public class Benz extends Car{

    public Benz(){
        description = "Benz";
    }

    @Override
    public double cost() {
        return 15000;
    }
}
