public class Main {
    public static void main(String[] args) {
        int balanc = 100;
        int replenishment = 5000 ;
        boolean bonus = 1000 < replenishment;

        int replenishmentbonus = bonus ? replenishment / 100 : replenishment * 0 ;
        int final_balance = balanc + replenishment + replenishmentbonus;

        System.out.println("Здравствуйте! Ваш баланс до поплнения: " + balanc );
        System.out.println("Ваше колчиесто бонусов: " + replenishmentbonus);
        System.out.println("Ваш текущий баланс: " + final_balance);
        System.out.println("До свидание!");




    }
}