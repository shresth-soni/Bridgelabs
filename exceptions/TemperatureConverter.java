class InvalidTemperatureException extends Exception { public InvalidTemperatureException(String m){super(m);} }

public class TemperatureConverter {
    public static void convert(double temp, char unit) throws InvalidTemperatureException {
        if ((unit == 'C' && temp < -273.15) || (unit == 'F' && temp < -459.67))
            throw new InvalidTemperatureException("Error: Temperature below absolute zero is not possible!");
        if (unit == 'C') System.out.println("Fahrenheit: " + (temp * 9/5 + 32));
        else System.out.println("Celsius: " + ((temp - 32) * 5/9));
    }

    public static void main(String[] args) {
        try {
            convert(-300, 'C');
        } catch (InvalidTemperatureException e) {
            System.out.println(e.getMessage());
        }
    }
}
