package ru.petrov.s04;

public class Car {

    private String model = "Нет сведений";
    private String brand = "";
    private String dateOfIssue = "Нет сведений";
    private String stateNumber = "Нет сведений";
    private double aRun;

    public Car() {
    }

    public Car(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public Car(String model, String brand, String dateOfIssue, String stateNumber, double aRun) {
        this.model = model;
        this.brand = brand;
        this.dateOfIssue = dateOfIssue;
        this.stateNumber = stateNumber;
        this.aRun = aRun;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    public double getaRun() {
        return aRun;
    }

    public void setaRun(double aRun) {
        this.aRun = aRun;
    }

    @Override
    public String toString(){
        return " Автомобиль: " + model + "-" + brand + ", Дата выпуска: " + dateOfIssue +
                ", гос номер: " + stateNumber +
                ", пробег в км: " + aRun +
                ':';
    }


}
