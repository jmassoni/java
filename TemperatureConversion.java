import java.util.Scanner;

public class TemperatureConversion {
   public static double celsiusToKelvin(double valueCelsius) {
      double valueKelvin = 0.0;

      valueKelvin = valueCelsius + 273.15;

      return valueKelvin;
   }

   /* Your solution goes here  */
   
   public static double kelvinToCelsius(double valueKelvin) {
      double valueCelsius = 0.0;

      valueCelsius = valueKelvin - 273.15;

      return valueCelsius;
   }


   public static void main (String [] args) {
      double valueC = 0.0;
      double valueK = 0.0;

      valueC = 10.0;
      System.out.println(valueC + " C is " + celsiusToKelvin(valueC) + " K");

      valueK = 283.15;
      System.out.println(valueK + " K  is " + kelvinToCelsius(valueK) + " C");

      return;
   }
}