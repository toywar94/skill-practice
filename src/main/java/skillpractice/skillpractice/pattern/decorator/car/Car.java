package skillpractice.skillpractice.pattern.decorator.car;


import skillpractice.skillpractice.pattern.decorator.Size;

public abstract class Car {

    Size size;

    String description = "";

    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize(){
        return this.size;
    }

    public String getDescription(){
        return description;
    }

    public abstract double cost();


}
