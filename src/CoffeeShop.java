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


    }
}