package Praktikum05;
import java.util.Scanner;
public class PemilihanHari18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayName, dayType ;

        System.out.print(" Input day name : ");
        dayName = sc.nextLine();

        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday" :
            case "wednesday":
            case "thursday":
            case "friday":    
            dayType = " weekday " ;
                break;
            case "saturday":
            case "sunday" :
            dayType = " weekend";    
            default:
            dayType = "invalid day name";
                break;
        }

        System.out.print(dayName + " is a " + dayType);
    }
}
