class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(StrarbucksCoffee coffee){
        super(coffee);
    }

    public String getDescription(){
        return coffee.getDescription() + "Молоко обычное";
    }

    public double cost(){
        return coffee.cost() + 0;
    }
}


class SoymilkDecorator extends CoffeeDecorator{
    public SoymilkDecorator(StrarbucksCoffee coffee){
        super(coffee);
    }

    public String getDescription(){
        return coffee.getDescription() + "Соевое Молоко";
    }

    public  double cost(){
        return coffee.cost() + 0.50;
    }
}

class CoconutDecorator extends CoffeeDecorator{
    public  CoconutDecorator(StrarbucksCoffee coffee){
        super(coffee);
    }

    public String getDescription(){
        return coffee.getDescription() + "Кокосовый Сироп";
    }

    public double cost(){
        return coffee.cost() + 1.75;

    }
}