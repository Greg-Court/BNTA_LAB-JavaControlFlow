import java.util.Scanner;

public class WhatShouldIWear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Dressy McWeatherman, your personal wardrobe assistant.");

        while (true) {
            System.out.println("");
            System.out.println("Please enter today's predicted temperature in degrees celcius");
            int temp = sc.nextInt();
            System.out.println("Now, please tell me, is it going to be cloudy, rainy, snowy or sunny today?");
            String condition = sc.next();
            System.out.println("Thanks, calculating your outfit for the day...");
            if (temp <= 12) {
                if (condition.equals("cloudy")) {
                    System.out.println("Move somewhere with better weather...");
                }
                if (condition.equals("rainy")) {
                    System.out.println("Dressing gown... stay indoors!");
                }
                if (condition.equals("snowy")) {
                    System.out.println("Grab your skis.");
                }
                if (condition.equals("sunny")) {
                    System.out.println("Shame it's not warm as well, lol.");
                }
            } else if (temp >= 13 && temp <= 22) {
                if (condition.equals("cloudy")) {
                    System.out.println("Wear your most mediocre clothes for the most mediocre day.");
                }
                if (condition.equals("rainy")) {
                    System.out.println("Chocolate Rain - Tay Zonday.");
                }
                if (condition.equals("snowy")) {
                    System.out.println("Well with it being so warm that snow is quite pointless isn't it.");
                }
                if (condition.equals("sunny")) {
                    System.out.println("Bikini - if you're brave enough.");
                }
            } else {
                if (condition.equals("cloudy")) {
                    System.out.println("T-shirt and shorts? Maybe trousers. Not sure.");
                }
                if (condition.equals("rainy")) {
                    System.out.println("A raincoat made of ice.");
                }
                if (condition.equals("snowy")) {
                    System.out.println("Where the hell do you live for there to be snow in this heat!?");
                }
                if (condition.equals("sunny")) {
                    System.out.println("Naked. You have to be naked today.");
                }
            }
            System.out.println("");
            System.out.println("Do you want advice for different conditions? (Y/N)");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("Y")) {
                continue;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("Goodbye.");
                break;
            }
        }



    }
}
