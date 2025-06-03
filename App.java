public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int num3 = scanner.nextInt();

        int largest = findLargest(num1, num2, num3);

        System.out.println("The largest integer is: " + largest);
        scanner.close();
    }

    public static int findLargest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
