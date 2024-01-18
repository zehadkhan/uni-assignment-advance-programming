import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        circleArea();
        EvenOdd();
        Factorials();
        Palindrome();
        PrimeNumber();

        scanner.close();
    }
//Task 1: Calculate the area of a circle

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        double area = Math.PI * Math.pow(radius, 2);
        
        System.out.println("The area of the circle is: " + area);
        
        scanner.close();
    }
}



//Task 2: Check if a number is even or odd

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        
        scanner.close();
    }
}

//Task 3: Calculate the factorial of a given number

import java.util.Scanner;

import java.util.Scanner;
public class Factorials {
    public static void main(String[] args) {
        int i;
        int fact = 1;
        int number;
            System.out.println("Enter a number: ");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            for(i=1; i<=number; i++)
            {
                 fact = fact * i;
            }
    System.out.println("Factorial of "+number+" is: "+fact);
    }
}



//Task 4: Check if a string is a palindrome

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversed = new StringBuilder(input).reverse().toString();
        
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        
        scanner.close();
    }
}

//Task 5: Check if a given number is prime

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        boolean isPrime = true;
        
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        scanner.close();
    }
}
}
