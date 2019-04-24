package com.iblog.pattern.prototype;

public class Show implements ProtoTypeCapable {
    private String name;

    @Override
    public ProtoTypeCapable clone() throws CloneNotSupportedException {
        return (Show) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Show => [name:" + name + "]";
    }
}
