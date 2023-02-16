import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int num = 1;
        int pepe = 0;
        while (num != 0) {
            num = scanner.nextInt();
            pepe++;
        }
        System.out.println(pepe - 1);
    }
}