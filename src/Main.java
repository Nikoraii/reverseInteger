public class Main {
    public static void main(String[] args)
    {
        int number = -123;
        System.out.println(reverse(number));
    }

    public static int reverse(int x) {
        long result = 0;
        if (x >= Math.pow(-2, 31) && x <= (Math.pow(2, 31)) - 1) {
            while (x != 0) {
                int add = x % 10;
                result = result * 10 + add;
                x = x / 10;
            }
        } else {
            return 0;
        }
        if (result >= Math.pow(-2, 31) && result <= (Math.pow(2, 31)) - 1) {
            return (int) result;
        } else {
            return 0;
        }
    }
}