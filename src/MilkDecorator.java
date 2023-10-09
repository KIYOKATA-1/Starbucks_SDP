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
