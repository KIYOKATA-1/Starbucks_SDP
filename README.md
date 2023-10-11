# Starbucks_SDP
## Software Design Patterns
## Assignment 2

# Abstract class StarbucksCoffee, Defines common properties and methods for all types of coffee.
### •	 description stores a description of the coffee (default "Coffee").
### •	 getDescription() returns a description of the coffee (a method that can be decorated).
### •	 cost() is an abstract method that subclasses must implement to calculate the cost of a coffee (another method that can be decorated). 


abstract class StrarbucksCoffee {
    String description = "Coffee";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}

# Abstract class CoffeeDecorator:
### • Expands StarbucksCoffee.
### • Contains the coffee field, which stores a reference to the StarbucksCoffee object being wrapped.

### • The constructor accepts a StarbucksCoffee object and stores it for later use.

### • getDescription() is an abstract method that subclasses must implement to return a description of the coffee with the topping added

   abstract class CoffeeDecorator extends StrarbucksCoffee{
    StrarbucksCoffee coffee;

    public CoffeeDecorator(StrarbucksCoffee coffee){
        this.coffee = coffee;
    }

    public abstract String getDescription();

# Decorator classes (MilkDecorator, SoymilkDecorator, CoconutDecorator):
### • Extend CoffeeDecorator.
### • Implement the abstract getDescription() method to add a specific flavor to the coffee description.
### • Implement the cost() method, which takes into account the cost of the added topping when calculating the total cost of the coffee.

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

# Classes of specific types of coffee (Frappuccino, Latte, Moka):
### • Expanding StarbucksCoffee.
### • Implement the abstract cost() method, providing specific cost values for each type of coffee.

class Frappuccino extends StrarbucksCoffee {
    public Frappuccino() {
        description = "Фраппуччино";
    }

    public double cost() {
        return 3.00;
    }
}
    class Latte extends StrarbucksCoffee{
        public Latte(){
            description = "Латте";
        }

        public double cost(){
            return 1.99;
        }
    }

    class Moka extends StrarbucksCoffee{
        public Moka(){
            description = "Мока";
        }

        public double cost(){
            return 5.99;
        }
    }
