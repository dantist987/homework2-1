package com.company;

public class Main {

    public static void main(String[] args) {
        Root root = new Root(2);
        SecondTooth secondTooth = new SecondTooth(14, ToothNameEnum.PREMOLAR, root, "Cavity class 3", "Middle");
        System.out.println(secondTooth.getInfo());

        System.out.println("---------------------------------------------");

        Root root1 = new Root(1);
        FirstTooth firstTooth = new FirstTooth(23, ToothNameEnum.CANINE, root1, "Cavity class 5");
        System.out.println(firstTooth.getInfo());

        System.out.println("---------------------------------------------");

        SecondTooth secondTooth1 = new SecondTooth(12, ToothNameEnum.INCISOR, root1, "Class 4", "Deep");
        System.out.println(secondTooth1.getInfo());
    }

}
