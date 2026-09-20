//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner; // <-- Add this line at the absolute top of Main.java

public class Main {
    public static void main(String[] args) {
// Create a Scanner object to read input
        Scanner in = new Scanner(System.in);

        // Variable Declarations
        double springCost;
        double summerCost;
        double fallCost;
        double winterCost;
        double totalCost;

        // Prompt and input for Spring
        System.out.print("What is the spring cost ? ");
        springCost = in.nextDouble();

        // Prompt and input for Summer
        System.out.print("What is the summer cost ? ");
        summerCost = in.nextDouble();

        // Prompt and input for Fall
        System.out.print("What is the fall cost ? ");
        fallCost = in.nextDouble();

        // Prompt and input for Winter
        System.out.print("What is the winter cost ? ");
        winterCost = in.nextDouble();

        // Calculate total
        totalCost = springCost + summerCost + fallCost + winterCost;

        // Display results
        System.out.println("Total yearly maintenance cost is " + totalCost);

        // Close the scanner (good practice)
        in.close();
    }
}