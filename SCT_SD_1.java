import java.util.Scanner;

public class SCT_SD_1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1.Celsius to Fahrenheit & Kelvin");
        System.out.println("2.Fahrenheit to Celsius & Kelvin");
        System.out.println("3.Kelvin to Celsius & Fahrenheit");
        System.out.print("Enter your choice:");
        int choice = sc.nextInt();
        double temp,celsius,fahrenheit,kelvin;
        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temp=sc.nextDouble();
                fahrenheit=(temp * 9 / 5) + 32;
                kelvin=temp + 273.15;
                System.out.println("Fahrenheit:"+fahrenheit);
                System.out.println("Kelvin:"+kelvin);
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit:");
                temp=sc.nextDouble();
                celsius=(temp-32)*5/9;
                kelvin=celsius+273.15;
                System.out.println("Celsius:"+celsius);
                System.out.println("Kelvin:"+kelvin);
                break;

            case 3:
                System.out.print("Enter temperature in Kelvin: ");
                temp=sc.nextDouble();
                celsius=temp-273.15;
                fahrenheit=(celsius*9/5)+32;
                System.out.println("Celsius:"+celsius);
                System.out.println("Fahrenheit:"+fahrenheit);
                break;

            default:
                System.out.println("Invalid choice!");
        }

    }
}