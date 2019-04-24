package com.iblog.pattern.prototype;

public class Movie implements ProtoTypeCapable {
    private String name;

    public ProtoTypeCapable clone() throws CloneNotSupportedException {
        // clone a Movie object in this.
        return (Movie) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "movie => [name:" + name + "]";
    }
}
