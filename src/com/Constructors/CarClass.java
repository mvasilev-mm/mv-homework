package com.Constructors;

public class CarClass {
    String name;
    String colour;
    int horsePower;
    int releaseYear;
    boolean secondHand;

    public CarClass(String name, String colour, int horsePower, int releaseYear, boolean secondHand) {
        this.name = name;
        this.colour = colour;
        this.horsePower = horsePower;
        this.releaseYear = releaseYear;
        this.secondHand = secondHand;
    }

    public CarClass(String name, String colour, boolean secondHand) {
        this.name = name;
        this.colour = colour;
        horsePower = -1;
        releaseYear = -1;
        this.secondHand = secondHand;
    }

    public CarClass(String name, String colour, int horsePower, int releaseYear) {
        this.name = name;
        this.colour = colour;
        this.horsePower = horsePower;
        this.releaseYear = releaseYear;
        this.secondHand = false;
    }

    public CarClass(String name, int horsePower, int releaseYear, boolean secondHand) {
        this.name = name;
        colour = "n/a";
        this.horsePower = horsePower;
        this.releaseYear = releaseYear;
        this.secondHand = secondHand;
    }

    public CarClass() {
        this.name = "n/a";
        this.colour = "n/a";
        this.horsePower = -1;
        this.releaseYear = -1;
        this.secondHand = false;
    }


    public static void main(String[] args) {
        CarClass carObject = new CarClass("CarName", "red", 500, 200, false);
        System.out.println(carObject.name);
        System.out.println(carObject.colour);
        System.out.println(carObject.horsePower);
        System.out.println(carObject.releaseYear);
        System.out.println(carObject.secondHand);

        CarClass carObject1 = new CarClass("CarName", 500, 200, false);
        System.out.println(carObject1.name);
        System.out.println(carObject1.colour);
        System.out.println(carObject1.horsePower);
        System.out.println(carObject1.releaseYear);
        System.out.println(carObject1.secondHand);

        CarClass carObject2 = new CarClass("CarName", "blue", true);
        System.out.println(carObject2.name);
        System.out.println(carObject2.colour);
        System.out.println(carObject2.horsePower);
        System.out.println(carObject2.releaseYear);
        System.out.println(carObject2.secondHand);

        CarClass carObject3 = new CarClass("CarName", "purple", true);
        System.out.println(carObject3.name);
        System.out.println(carObject3.colour);
        System.out.println(carObject3.horsePower);
        System.out.println(carObject3.releaseYear);
        System.out.println(carObject3.secondHand);

        CarClass carObject4 = new CarClass();
        System.out.println(carObject4.name);
        System.out.println(carObject4.colour);
        System.out.println(carObject4.horsePower);
        System.out.println(carObject4.releaseYear);
        System.out.println(carObject4.secondHand);
    }


}
