package com.company;
import java.util.Scanner;
import static com.company.BMI.calculateAge;
import static com.company.BMI.classifyBMI;

/**
 * The main class which drives the program utilizing methods from the other classes.
 */
public class Main {

    /**
     *  The main method asks and takes in input from the user, and then outputs all of their relevant information which their
     *  includes their BMI value and their BMI classification.
     * @param args //
     */
    public static void main(String[] args) {
        // Creating a new person object.
        Person person1 = new Person(); // Create an instance of the person object using the default constructor.
        Scanner input = new Scanner(System.in); // Create a scanner object to be used for inputs.

        // First Instance Prompts:
        System.out.printf("%s", "Enter person's name: ");
        String fullName1 = input.nextLine(); // Take in input from the keyboard for the person's name
        person1.setFullName(fullName1); // Initialize it to the person object's full name.
        System.out.printf("%s", "Enter person's year of birth: ");
        int birthYear1 = input.nextInt(); // Take in input from the keyboard for the person's birth year.
        person1.setBirthYear(birthYear1); // initialize the birth year for the person.
        System.out.printf("%s", "Enter person's height in meters: ");
        double height1 = input.nextDouble(); // Take in input from the keyboard for the person's height.
        person1.setHeight(height1); // initialize the height for the person object.
        System.out.printf("%s", "Enter person's weight in kilograms: ");
        double weight1 = input.nextDouble(); // take in input for the person's weight.
        person1.setWeight(weight1); // initialize the weight for the person object.
        input.nextLine(); // Consume newline left-over

        // Second Instance Prompts:
        System.out.printf("%s", "\nSecond Instance Prompts\n");
        System.out.printf("%s", "Enter person's name: ");
        String fullName = input.nextLine(); // Take in input from the keyboard for the person's full name.
        System.out.printf("%s", "Enter person's year of birth: ");
        int birthYear2 = input.nextInt(); // Take in input from the keyboard for the person's birth year.
        System.out.printf("%s", "Enter person's height in meters: ");
        double height2 = input.nextDouble(); // Take in input from the keyboard for the person's height.
        System.out.printf("%s", "Enter person's weight in kilograms: ");
        double weight2 = input.nextDouble(); // the person's weight is taken as input and initialized/stored into the weight2 variable
        Person person2 = new Person(fullName, birthYear2, height2, weight2); // The Non-default constructor is used to initialize an instance of the person object
        input.close();

        // Outputs: Instance 1
        System.out.printf("%s", "\n1st Instance Output\n");
        System.out.printf("%16s %s %n", "Full Name:", person1.getFullName()); // Prints the full name of the person for the first instance.
        System.out.printf("%16s %d %n", "Age:", calculateAge(person1)); // Prints the calculated age of the person for the first instance.
        System.out.printf("%16s %d %n", "Year:", person1.getBirthYear()); // Prints the year the person was born for the first instance.
        System.out.printf("%16s %.2f %n", "Height:", person1.getHeight()); // Prints the height of the person for the first instance.
        System.out.printf("%16s %.2f %n", "Weight:", person1.getWeight()); // Prints the weight of the person for the first instance.
        System.out.printf("%16s %s %n", "Classification:", classifyBMI(person1)); // Prints the BMI classification of the person for the first instance.

        // Outputs: Instance 2
        System.out.printf("%s", "\n2nd Instance Output\n");
        System.out.printf("%16s %s %n", "Full Name:", person2.getFullName()); // Prints the full name of the person for the second instance.
        System.out.printf("%16s %d %n", "Age:", calculateAge(person2)); // Prints the calculated age of the person for the second instance.
        System.out.printf("%16s %d %n", "Year:", person2.getBirthYear()); // Prints the birth year of the person for the second instance.
        System.out.printf("%16s %.2f %n", "Height:", person2.getHeight()); // Prints the height of the person for the second instance.
        System.out.printf("%16s %.2f %n", "Weight:", person2.getWeight()); // Prints the weight of the person for the second instance.
        System.out.printf("%16s %s %n", "Classification:", classifyBMI(person2)); // Prints the BMI classification of the person for the second instance.
    }
}