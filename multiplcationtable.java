public class multiplcationtable {

    public static void main(String[] args) {
        int number = 0;

        System.out.print("Enter a number to generate its multiplication table: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        number = sc.nextInt();

        // Multiplication table from 1 to 20
        for (int i = 1; i <= 20; i++) {
            int product = number * i;
            System.out.println(number + " x " + i + " = " + product);
        }
    }
}

