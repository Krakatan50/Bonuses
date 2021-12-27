public class Main {
    public static void main(String[] args) {
        int account = 1000; // остаток на счете
        int payments = 100; // сумма пополнения
        int totalAccount = account + payments;
        int bonus = payments / 100; // расчет бонуса
        int totalBonus = bonus + totalAccount;


        if (payments < 1000) {
            System.out.println("Баланс Вашего счета: " + totalAccount + " рублей." + " Ваш бонус: " + "0 рублей");
        } else
            System.out.println("Баланс Вашего счета: " + totalBonus + " рублей" + " Ваш бонус: " + bonus + " рублей");

    }
}





