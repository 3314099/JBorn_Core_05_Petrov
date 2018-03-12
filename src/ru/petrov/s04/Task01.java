package ru.petrov.s04;

public class Task01 {
    public static void main(String[] args) {

//        Car car1 = new Car();
//        Car car1 = new Car("BMW", "X5", "2010.08.01", "O777OO/78Rus", 300000.5);
        Car car1 = new Car("BMW", "X5");

//        Car car2 = new Car();
//        Car car2 = new Car("ВАЗ", "2101", "1976.04.01", "Л666OХ/93Rus", 1000000);
        Car car2 = new Car("ВАЗ", "2101");

//        Driver driver1 = new Driver();
//        Driver driver1 = new Driver("Иван", car1 );
        Driver driver1 = new Driver("Иван", "Иванов", "Иванович", "2000.05.09", 5, car1);

//        Driver driver2 = new Driver();
//        Driver driver2 = new Driver("Сергей", "Сергеев", "Сергеевич", "1990.02.28", 2, car2);
        Driver driver2 = new Driver("Сергей", car2);

        System.out.println(driver1.toString());
        System.out.println(driver2.toString());

    }
}
