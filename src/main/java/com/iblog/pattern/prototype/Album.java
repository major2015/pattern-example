package com.iblog.pattern.prototype;

public class Album implements ProtoTypeCapable {
    private String name;

    @Override
    public ProtoTypeCapable clone() throws CloneNotSupportedException {
        return (Album) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "album => [name:" + name + "]";
    }
}
