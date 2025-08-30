import java.util.*;

interface TemperatureConverter {
    double toFahrenheit(double c);
    double toCelsius(double f);
}

class Converter implements TemperatureConverter {
    public double toFahrenheit(double c) { return (c*9/5)+32; }
    public double toCelsius(double f) { return (f-32)*5/9; }
}

public class TempDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Converter c = new Converter();
        try {
            System.out.print("Enter Celsius: ");
            double cel = Double.parseDouble(sc.nextLine());
            System.out.println("In Fahrenheit: " + c.toFahrenheit(cel));
        } catch(NumberFormatException e) {
            System.out.println("Invalid number format!");
        }
    }
}

