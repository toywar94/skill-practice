package skillpractice.skillpractice.pattern.decorator.car;

public class Audi extends Car {

    public Audi(){
        description = "Audi";
    }

    //swich factory 패턴 쓰면 중복 코드 제거 가능할 것 같은데
    @Override
    public double cost() {
        return 10000 ;
    }
}
