package ru.petrov.s04;

public class Driver {

    private String name;
    private String surname;
    private String middleName;
    private String dateOfBirth;
    private int drivingExperience;
    private Car car;


    public Driver() {
    }

    public Driver(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public Driver(String name, String surname, String middleName, String dateOfBirth, int drivingExperience, Car car) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.drivingExperience = drivingExperience;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Водитель: " + surname + " " + name + " " + middleName + ", " + dateOfBirth + ", Стаж: " + drivingExperience +
                " лет. " + car;
    }
}
