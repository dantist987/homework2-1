package com.company;

public final class SecondTooth extends FirstTooth {
    private String depth;

    public SecondTooth(int num, ToothNameEnum toothNameEnum, Root root, String cavity) {
        super(num, toothNameEnum, root, cavity);
    }

    public SecondTooth(int num, ToothNameEnum toothNameEnum, Root root, String cavity, String depth) {
        super(num, toothNameEnum, root, cavity);
        this.depth = depth;
    }

    public SecondTooth(String cavity, String depth) {
        super(cavity);
        this.depth = depth;
    }

    public SecondTooth(String cavity) {
        super(cavity);
    }

    public SecondTooth(int num) {
        super();
    }


    public String getDepth() {
        return depth;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nCavity depth is: " + depth;
    }
}
