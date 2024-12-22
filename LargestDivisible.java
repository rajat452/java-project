public class LargestDivisible {
    public static void main(String[] args) {
        // Find the largest 4-digit number divisible by 10 and 13
        int num = 9999;
        while (num > 999) {
            if (num % 10 == 0 && num % 13 == 0) {
                System.out.println("Largest 4-digit number divisible by 10 and 13: " + num);
                break;
            }
            num--;
        }
    }
}

