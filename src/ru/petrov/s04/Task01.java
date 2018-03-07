package ru.petrov.s04;

public class Task01 {
    public static void main(String[] args) {

//        Car car1 = new Car();
        Car car1 = new Car("BMW", "X5", "2010.08.01", "O777OO/78Rus", 300000.5);
//        Car car1 = new Car("BMW", "X5");

//        Car car2 = new Car();
//        Car car2 = new Car("ВАЗ", "2101", "1976.04.01", "Л666OХ/93Rus", 1000000);
        Car car2 = new Car("ВАЗ", "2101");

//        Driver driver1 = new Driver();
        Driver driver1 = new Driver("Иван", "Иванов", "Иванович", "1970.05.26", 13, car1.toString());
//        Driver driver1 = new Driver("Иван", "Иванов");

//        Driver driver2 = new Driver();
//        Driver driver2 = new Driver("Ахмед", "Махачкалинский", "Дудаевич", "1990.02.28", 2, car1.toString());
        Driver driver2 = new Driver("Ахмед", "Махачкалинский", car2.toString());

        System.out.println(driver1.toString());
        System.out.println(driver2.toString());

    }
}
