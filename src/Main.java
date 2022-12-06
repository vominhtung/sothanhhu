import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to read: ");
        int number = scanner.nextInt();
        String number1 = "";
        String number2 = "";
        String unit = "";
        String resuilt = "";
        switch (number) {
            case 0:
                number1 = "Zero";
                break;
            case 1:
                number1 = "One";
                break;
            case 2:
                number1 = "Two";
                break;
            case 3:
                number1 = "Three";
                break;
            case 4:
                number1 = "Four";
                break;
            case 5:
                number1 = "Five";
                break;
            case 6:
                number1 = "Six";
                break;
            case 7:
                number1 = "Seven";
                break;
            case 8:
                number1 = "Eight";
                break;
            case 9:
                number1 = "Nine";
                break;
        }
        switch (number % 10) {
            case 0:
                number2 = "Ten";
                break;
            case 1:
                number2 = "Eleven";
                break;
            case 2:
                number2 = "Twelve";
                break;
            case 3:
                number2 = "Thir" + "teen";
                break;
            case 4:
                number2 = "Four" + "teen";
                break;
            case 5:
                number2 = "Fif" + "teen";
                break;
            case 6:
                number2 = "Six" + "teen";
                break;
            case 7:
                number2 = "Seven" + "teen";
                break;
            case 8:
                number2 = "Eigh" + "teen";
                break;
            case 9:
                number2 = "Nine" + "teen";
                break;
        }
        switch (number % 10) {
            case 0:
                unit = "";
                break;
            case 1:
                unit = "One";
                break;
            case 2:
                unit = "Two";
                break;
            case 3:
                unit = "Three";
                break;
            case 4:
                unit = "Four";
                break;
            case 5:
                unit = "Five";
                break;
            case 6:
                unit = "Six";
                break;
            case 7:
                unit = "Seven";
                break;
            case 8:
                unit = "Eight";
                break;
            case 9:
                unit = "Nine";
                break;
        }
        if (number>=100&&number<1000){
            switch (number/100){
                case 1:
                    number = number - (number/100)*100;
                    resuilt = "One hundred ";
                    break;
                case 2:
                    number = number - (number/100)*100;
                    resuilt = "Two hundred ";
                    break;
                case 3:
                    number = number - (number/100)*100;
                    resuilt = "Three hundred ";
                    break;
                case 4:
                    number = number - (number/100)*100;
                    resuilt = "Four hundred ";
                    break;
                case 5:
                    number = number - (number/100)*100;
                    resuilt = "Five hundred ";
                    break;
                case 6:
                    number = number - (number/100)*100;
                    resuilt = "Six hundred ";
                    break;
                case 7:
                    number = number - (number/100)*100;
                    resuilt = "Seven hundred ";
                    break;
                case 8:
                    number = number - (number/100)*100;
                    resuilt = "Eight hundred ";
                    break;
                case 9:
                    number = number - (number/100)*100;
                    resuilt = "Nine hundred ";
                    break;
            }
        }
        if (number < 10 && number >= 0) {
            resuilt += number1;
        } else if (number < 20 && number >= 10) {
            resuilt += number2;
        } else if (number >= 20) {
            if (number < 30) {
                resuilt += "Twenty" ;
            } else if (number < 40) {
                resuilt += "Thirty" ;
            } else if (number < 50) {
                resuilt += "Forty" ;
            } else if (number < 60) {
                resuilt += "Fifty" ;
            } else if (number < 70) {
                resuilt += "Sixty" ;
            } else if (number < 80) {
                resuilt += "Seventy" ;
            } else if (number < 90) {
                resuilt += "Eighty";
            } else if (number < 100) {
                resuilt += "Ninety";
            }
        }
        System.out.println(resuilt);
    }
}
