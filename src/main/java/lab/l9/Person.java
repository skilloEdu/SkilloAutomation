package main.java.lab.l9;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final String religion;
    private final String language;
    private final String nationality;
    private char sex;
    private String job;
    private String EGN;
    private LocalDate dateOfBirth;
    private int age;
    private String country;

    public Person(String name, char sex, String religion, String language, String job, String nationality, String egn, String country) {
        this.name = name;
        setSex(sex);
        this.religion = religion;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.EGN = validateEGN(egn);
        this.dateOfBirth = calculateDateOfBirth(this.EGN);
        this.age = calculateAge(this.dateOfBirth);
        this.country = country;
    }

    /**
     * Calculates the date of birth based on the provided EGN.
     * The EGN format is YYMMDDXXXX, where:
     * - YY represents the last two digits of the birth year.
     * - MM represents the month of birth.
     * - DD represents the day of birth.
     * - XXXX represents a unique identifier for the birthdate.
     * If the month is greater than 40 the year is set to 2000s. Otherwise, the year is set to 1900s.
     *
     * @param EGN The EGN (personal identification number) of the person.
     * @return The calculated date of birth.
     */
    private LocalDate calculateDateOfBirth(String EGN) {
        int year = Integer.parseInt(EGN.substring(0, 2));
        int month = Integer.parseInt(EGN.substring(2, 4));
        int day = Integer.parseInt(EGN.substring(4, 6));
        if (month > 40) {
            // Adjust month for female's month and set the year to 2000s
            month -= 40;
            year += 2000;
        } else {
            // Set the year to 1900s
            year += 1900;
        }
        return LocalDate.of(year, month, day);
    }

    private int calculateAge(LocalDate dateOfBirth) {
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    private String validateEGN(String EGN) {
        if (EGN.length() == 10 && containsOnlyDigits(EGN)) {
            return EGN;
        } else {
            throw new IllegalArgumentException("The provided EGN is not valid! The EGN must contain only 10 digits!");
        }
    }

    private boolean containsOnlyDigits(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    private void setSex(char sex) {
        try {
            validateSex(sex);
            this.sex = sex;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void validateSex(char sex) throws IllegalArgumentException {
        if (sex != 'M' && sex != 'F') {
            throw new IllegalArgumentException("Please provide a valid value for sex. Valid options are 'M' or 'F'");
        }
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void celebrateEaster() {
        if (religion.equalsIgnoreCase("orthodox") || religion.equalsIgnoreCase("catholic")) {
            System.out.println("I am celebrating Easter");
        } else {
            System.out.println("I am not celebrating Easter");
        }
    }

    public boolean isAdult() {
        switch (country) {
            case "Bulgaria":
            case "Italy":
                return age >= 18;
            case "USA":
                return age >= 21;
            default:
                throw new RuntimeException("We don't have information about adult age in your country: " + country);
        }
    }

    public boolean canTakeLoan() {
        if (job == null || job.isEmpty()) {
            return false;
        }


        switch (job.toLowerCase()) {
            case "student":
            case "unemployed":
                return false; // Students and unemployed individuals typically can't take loans
            default:
                return true; // Return true for all other job types
        }
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", religion='" + religion + '\'' +
                ", language='" + language + '\'' +
                ", nationality='" + nationality + '\'' +
                ", sex=" + sex +
                ", job='" + job + '\'' +
                ", EGN='" + EGN + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
