import java.util.Scanner;
public class HoroscopeFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String message1,message2,message3,message4,message5;
        int day,month;

        message1 = "Welcome to horoscope finder";
        message2 = "Please enter the month of the year in which you were born : ";
        message3 = "Please enter your birth day : ";
        message4 = "Invalid value";

        System.out.print(message1 + "\n" + message2);
        month = input.nextInt();
        System.out.print(message3);
        day = input.nextInt();


        if (month == 1){
            if (day >= 1 && day <= 21){
                System.out.println("Capricorn");
            } else if (day >= 22 && day <= 31){
                System.out.println("Aquarius");
            } else {
                System.out.println(message4);
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 19){
                System.out.println("Aquairus");
            } else if (day >= 20 && day <= 29) {
                System.out.println("Pisces");
            } else {
                System.out.println(message4);
            }
        } else if (month == 3) {
            if (day >= 1 && day <=20){
                System.out.println("Pisces");
            } else if (day >= 21 && day <= 31) {
                System.out.println("Aries");
            } else {
                System.out.println(message4);
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 20) {
                System.out.println("Aries");
            } else if (day >= 21 && day <= 31) {
                System.out.println("Taurus");
            } else {
                System.out.println(message4);
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 21) {
                System.out.println("Taurus");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Gemini");
            } else {
                System.out.println(message4);
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 22) {
                System.out.println("Gemini");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Cancer");
            } else {
                System.out.println(message4);
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 22) {
                System.out.println("Cancer");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Leo");
            } else {
                System.out.println(message4);
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 22) {
                System.out.println("Leo");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Virgo");
            } else {
                System.out.println(message4);
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 22) {
                System.out.println("Virgo");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Libra");
            } else {
                System.out.println(message4);
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 22) {
                System.out.println("libra");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Scorpio");
            } else {
                System.out.println(message4);
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 21) {
                System.out.println("Scorpio");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Sagittarius");
            } else {
                System.out.println(message4);
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 21) {
                System.out.println("Sagittarius");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Capricorn");
            } else {
                System.out.println(message4);
            }
        }
    }
}
