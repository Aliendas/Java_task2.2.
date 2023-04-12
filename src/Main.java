public class Main {
    public static void main(String[] args) {

        int account = 100;
        int addAmount = 1100;

        if (addAmount > 1000) {
            System.out.println("Итоговый счет "+ (account + addAmount + addAmount / 100)   +
                    " Количество бонусных рублей " + addAmount / 100 );
        } else {
            System.out.println("Итоговый счет " + (account + addAmount) + " Количество бонусных рублей = 0");
        }
    }
}
