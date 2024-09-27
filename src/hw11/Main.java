package hw11;

public class Main {
    public static void main(String[] args){
        Person person = new Person();
        person.name = "John";
        person.age = 30;
        person.profession = "Engineer";
        String name = person.name;
        int age = person.age;
        String profession = person.profession;
        System.out.printf("Name: %s, Age: %d, Profession: %s \n", name, age, profession);
        Person person2 = new Person();
        person2.name = "Mary";
        person2.age = 25;
        person2.profession = "Teacher";
        String name2 = person2.name;
        int age2 = person2.age;
        String profession2 = person2.profession;
        System.out.printf("Name: %s, Age: %d, Profession: %s \n", name2, age2, profession2);

        Person person3 = new Person();
        person3.name = "Bob";
        person3.age = 35;
        person3.profession = "Doctor";
        String name3 = person3.name;
        int age3 = person3.age;
        String profession3 = person3.profession;
        System.out.printf("Name: %s, Age: %d, Profession: %s \n", name3, age3, profession3);

        Person person4 = new Person();
        person4.name = "Kate";
        person4.age = 28;
        person4.profession = "Architect";
        String name4 = person4.name;
        int age4 = person4.age;
        String profession4 = person4.profession;
        System.out.printf("Name: %s, Age: %d, Profession: %s \n", name4, age4, profession4);
        Person person5 = new Person(person4.name, person4.age);
        person5.profession = "Designer";
        String profession5 = person5.profession;
        System.out.printf("Name: %s, Age: %d, Profession: %s \n", name4, age4, profession5);
    }
}
