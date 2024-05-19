import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items: ");
        int n = sc.nextInt();

        System.out.println("Enter seed: ");
        int seed = sc.nextInt();

        Problem problem = new Problem(n, seed);
        System.out.println(problem.toString());

        System.out.println("Enter capacity: ");
        int capacity = sc.nextInt();

        Result result = problem.Solve(capacity);

        System.out.println(result.toString());
    }
}