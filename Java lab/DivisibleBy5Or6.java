public class DivisibleBy5Or6 {
    public static void main(String[] args) {
        int count = 0;
        for (int numbers = 100; numbers <= 200; numbers++) {
            if ((numbers % 5 == 0 || numbers % 6 == 0) && !(numbers % 5 == 0 && numbers % 6 == 0)) {
                System.out.print(numbers + " ");
                count ++;

                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
