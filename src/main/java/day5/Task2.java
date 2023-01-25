package day5;


public class Task2 {
    public static void main(String[] args) {

        Motorbike motorbike = new Motorbike();
        motorbike.setModel("Monster");
        motorbike.setColor("Red");
        motorbike.setYear(2022);
        System.out.println("Model: " + motorbike.getModel());
        System.out.println("Color: " + motorbike.getColor());
        System.out.println("Year: " + motorbike.getYear());
    }
}

class Motorbike {

    private String model;
    private String color;
    private int year;

    public void setModel(String model) {
        if (model.isEmpty()) {
            System.out.println("You entered incorrect model data!!!");
        }
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setColor(String color) {
        if (color.length() > 0) {
            this.color = color;
        } else {
            System.out.println("you entered incorrect color date!!!");
        }
    }

    public String getColor() {
        return this.color;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("You entered incorrect year date!!!");
        }
    }

    public int getYear() {
        return this.year;
    }
}