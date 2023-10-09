import java.util.Scanner;
public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StrarbucksCoffee coffee = null;

        System.out.println("Добро Пожаловать в Starbucks");
        System.out.println("Какой напиток желаете? :");
        System.out.println("1. Фраппучино");
        System.out.println("2. Латте");
        System.out.println("3. Мока");


        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                coffee = new Frappuccino();
                break;

            case 2:
                coffee = new Latte();
                break;

            case 3:
                coffee = new Moka();
                break;

            default:
                System.out.println("Нет Такого!!");
                return;
        }

        System.out.println("Выберите Топинг: ");
        System.out.println("1. Молоко");
        System.out.println("2. Соевое Молоко");
        System.out.println("3. Кокосовый Сироп");

        choice = scanner.nextInt();
        switch (choice){
            case 1:
                coffee = new MilkDecorator(coffee);
                break;
            case 2:
                coffee = new SoymilkDecorator(coffee);
                break;
            case 3:
                coffee = new CoconutDecorator(coffee);
                break;

            default:
                System.out.println("Такой Добавки нет. Кофе будет без добавки");
        }
        System.out.println("Заказ: " + coffee.getDescription() + ", Цена: $" + coffee.cost());
    }
}