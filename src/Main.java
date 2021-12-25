public class Main {
    public static void main(String[] args) {
        int account = 1000; // остаток на счете
        int payments = 1000; // сумма пополнения
        int totalAccount = account + payments;
        int bonus = payments / 100; // расчет бонуса
        int totalBonus = bonus + totalAccount;

        if (payments < 1000) {
            System.out.println("Баланс Вашего счета: " + totalAccount + " рублей");
        }
        if (payments >= 1000) {
            System.out.println("Баланс Вашего счета: " + totalBonus + " рублей");
        }
        if (payments >= 1000) {
            System.out.println("Ваш бонус за данную покупку: " + bonus + " рублей");
        }

    }
}




