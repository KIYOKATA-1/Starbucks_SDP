abstract class CoffeeDecorator extends StrarbucksCoffee{
    StrarbucksCoffee coffee;

    public CoffeeDecorator(StrarbucksCoffee coffee){
        this.coffee = coffee;
    }


}
