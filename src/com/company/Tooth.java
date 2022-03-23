package com.company;

public class Tooth {
    private int num;
    private ToothNameEnum toothNameEnum;
    private Root root;

    public Tooth(int num, ToothNameEnum toothNameEnum, Root root) {
        this.num = num;
        this.toothNameEnum = toothNameEnum;
        this.root = root;
    }

    public Tooth(String cavity) {
    }

    public Tooth() {

    }


    public int getNum() {
        return num;
    }

    public ToothNameEnum getToothEnum() {
        return toothNameEnum;
    }

    public Root getRoot() {
        return root;
    }

    public String getInfo() {
        return "Tooth number is: " + num +
                "\nTooth name is: " + toothNameEnum +
                "\nTooth roots are: " + root.getRoot();

    }
}
