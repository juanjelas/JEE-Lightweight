package com.jeesample.cloud;

public class Cloud {

    private String name;
    private int hype;

    public Cloud(String name, int hype) {
        this.name = name;
        this.hype = hype;
    }

    public String getName() {
        return name;
    }

    public int getHype() {
        return hype;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHype(int hype) {
        this.hype = hype;
    }

    @Override
    public String toString() {
        return "Cloud{" +
                "name='" + name + '\'' +
                ", hype=" + hype +
                '}';
    }
}
