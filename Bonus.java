public class Bonus {
    public static void main(String[] args) {
        long balance = 200;
        long amount = 1300;
        long bonus = amount / 100;
        if (amount < 1000) {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}

