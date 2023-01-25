package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setModel("Sl");
        car.setColor("White");
        car.setYear(2023);
        System.out.println("Model: " + car.getModel() + '\n' + "Color: " + car.getColor() + '\n' +
                "Year: " + car.getYear());

    }
}

class Car {

    private String model;
    private String color;
    private int year;

    public void setModel(String copyMod) {
        if(copyMod.length() > 0) {
            model = copyMod;
        } else {
            System.out.println("You entered an invalid model value!!!");
        }
    }

    public String getModel() {
        return model;
    }

    public void setColor(String copColor) {
        if (copColor.isEmpty()) {
            System.out.println("You entered an invalid color value!!!");
        } else {
            color = copColor;
        }
    }

    public String getColor() {
        return color;
    }

    public void setYear(int copYear) {
        if (copYear > 0) {
            year = copYear;
        } else {
            System.out.println("You entered an invalid year value!!!");
        }
    }

    public int getYear() {
        return year;
    }





}




//        Person person = new Person();
//        person.setName("Dima");
//        person.setAge(30);
//        System.out.println("Name: " +  person.getName() + '\n' + " Age: " + person.getAge());



//class Person {
//    private String name;
//    private int age;
//
////    Person(String name, int age) {
////        this.name = name;
////        this.age = age;
////    }
//
//    public void setName(String n) {
////        if (n.length() > 0)
//        if(n.isEmpty()) {
//            System.out.println("You entered incorrect number!!! ");
//        }else {
//            name = n;
//        }
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(int a) {
//        if (a > 0) {
//            age = a;
//        } else {
//            System.out.println("You entered incorrect data");
//        }
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//}
