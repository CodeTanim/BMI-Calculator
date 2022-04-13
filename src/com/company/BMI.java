package com.company;
import java.util.GregorianCalendar;


/**
 *  A Java object with multiple operations related to BMI computations.
 */
public class BMI {

    /**
     * Calculates the age of the person based on the year they were born.
     * @param person An instance of a person object is passed containing information about a specific person. Information about the
     *               year they were born is extracted and used.
     * @return The age of the person is calculated by subtracting the current year by the birth year of the person and returned as an int value.
     */
    public static int calculateAge(Person person) {

        int birthYear = person.getBirthYear(); // Gets the birth year of the person.
        int currentYear = new GregorianCalendar().get(GregorianCalendar.YEAR); // Gets the current year.
        return (currentYear-birthYear);
    }

    /**
     * The BMI is calculated and returned as a double.
     * @param person An instance of a person object containing information about a specific person from which the weight and height is extracted.
     * @return The BMI is calculated by doing weight/(height)^2 then returned as a double value.
     */
    public static double calculateBMI(Person person) {

        double weight = person.getWeight(); // Gets the weight of the person.
        double height = person.getHeight(); // Gets the height of the person.
        return (weight)/(java.lang.Math.pow(height, 2));
    }

    /**
     * A string classification is designated for the person based on their BMI value.
     * @param person An instance of a person object is passed, so we have all of the information we need to classify their BMI by passing that person object into the
     *               calculateBMI method.
     * @return Based on the numerical BMI value of a person, a string classifying their BMI is returned.
     */
    public static String classifyBMI(Person person) {

        double BMI = calculateBMI(person); // The BMI of the person object passed as parameter is calculated and initialized.

        if(BMI < 18.5) {
            return "Underweight";
        }
        if((BMI >= 18.5) && (BMI < 25.0)) {
            return "Normal Weight";
        }
        if ((BMI >= 25.0) && (BMI < 30.0)){
            return "Overweight";
        }
        return "Obese";
    }
}
