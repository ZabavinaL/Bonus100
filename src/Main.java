public class Main {
    public static void main(String[] args) {
        int r_amount = 1900; // сумма пополнения
        int rubles = 100; // 1 рубль за каждые 100 рублей
        int c_account = 100; // текущий счет
        int bonus = r_amount / rubles;

        if (r_amount > 1000) {
            c_account = c_account + r_amount + bonus;
        } else {
            bonus = 0;
            c_account = c_account + r_amount;
        }

        System.out.println(bonus);
        System.out.println(c_account);
    }
}
