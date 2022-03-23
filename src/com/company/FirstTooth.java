package com.company;

public class FirstTooth extends Tooth{
    private String cavity;

    public FirstTooth(int num, ToothNameEnum toothNameEnum, Root root, String cavity) {
        super(num, toothNameEnum, root);
        this.cavity = cavity;
    }

    public FirstTooth(String cavity) {
        super(cavity);
        this.cavity = cavity;
    }

    public FirstTooth() {
        super();
    }

    public String getCavity() {
        return cavity;
    }
}
