package com.company;

/**
 * A Plain Old Java Object (POJO) that contains information about a person.
 */
public class Person {

    private String fullName; // Private variable used to store the name of a person
    private int birthYear; // Private variable used to store the year a person was born.
    private double height; // Private variable used to store the height of a person.
    private double weight; // Private variable used to store the weight of a person

    /**
     *  Default Constructor.
     */
    public Person() {
        this("",-1,-1.0,-1.0);
    }

    /**
     * This is the non-default constructor for the person object. It is capable of taking in 4 parameters for initialization.
     * @param fullName The full name is taken as input from the main class and passed as a string to this constructor to initialize.
     * @param birthYear The birth year of the person is taken as input from the main class and passed as an integer to this constructor to
     *                  initialize.
     * @param height The height is taken as input from the main class and passed as a double to this constructor to initialize.
     * @param weight The weight is taken as input from the main class and passed as a double to this constructor to initialize.
     */
    public Person(String fullName, int birthYear, double height, double weight) {

        this.fullName = fullName;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Can be called in other classes to get the full name of an instance of a person object. This method is used because
     * fullName is a private variable and cannot be freely accessed in other classes.
     * @return The full name of an instance of the person object is returned as a string.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * This method can be called in another class to set the name of an instance of a person object. It has no return value.
     * @param fullName The parameter is a string passed from the main method
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * This method can be called in another class to retrieve the birth year associated with an instance of a person object.
     * @return The return value is an integer representing the year the person was born.
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     *  This method can be called in another class to set the birth year of an instance of a person object. It has no return value.
     * @param birthYear The parameter is an integer taken as input and then passed from the main method representing the year the person was born
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    /**
     * This method can be called in another class to retrieve the height associated with an instance of a person object.
     * @return  The return value is a double representing the height of the person.
     */
    public double getHeight() {
        return height;
    }

    /**
     * This method can be called in another class to set the height of the person object. It has no return value.
     * @param height The parameter is a double taken as input and then passed from the main method representing the height of the person.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * This method can be called in another class to retrieve the height associated with an instance of a person object.
     * @return The return value is a double representing the weight of the person.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * This method can be called in another class to set the weight of an instance of a person object. It has no return value.
     * @param weight The parameter is a double taken as input and then passed from the main method representing the height of the person.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
}