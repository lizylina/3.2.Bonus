public class Bonus {
    public static void main(String[] args) {
        int balance = 100;
        int amount = 1300;
        int bonus = (amount / 100);
        if (amount < 1000) {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}

