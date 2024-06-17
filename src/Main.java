import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Læs vægt og højde fra brugeren
        System.out.print("Indtast din vægt i kilogram: ");
        double weight = input.nextDouble();

        System.out.print("Indtast din højde i meter: ");
        double height = input.nextDouble();

        // Beregn BMI
        double bmi = weight / (height * height);

        // Udskriv resultatet
        System.out.println("Din BMI er: " + bmi);

        input.close();
    }
}
