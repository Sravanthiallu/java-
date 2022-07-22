import java.util.Scanner;
class FibonacciSeries {
    public static void main(String z[]) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter n value : ");
	  int n = sc.nextInt();
        int fib1 = 0;
        int fib2 = 1;
        int fib3=fib1+fib2;
        System.out.print(fib1 + " " + fib2);
        while (n > fib3) {
            fib1=fib2;
            fib2=fib3;
            fib3 = fib1 + fib2;
		System.out.print(" " + fib3);
        }
    }
}