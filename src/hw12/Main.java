package hw12;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Harvey Reginald Specter", "Attorney", "harveyspecter@gmail.com", "345680340", 45);
        System.out.println("Full name: " + employee.getFullName());
        System.out.println("Job: " + employee.getPosition());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Phone number: " + employee.getPhone());
        System.out.println("Age: " + employee.getAge());

        Car car = new Car();
        car.start();
    }
}
