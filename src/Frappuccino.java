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