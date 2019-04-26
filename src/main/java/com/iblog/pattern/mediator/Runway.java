package com.iblog.pattern.mediator;

public class Runway {
    private final int number;
    private final String name;
    private final boolean occupied;

    public Runway(Builder builder) {
        this.number = builder.number;
        this.name = builder.name;
        this.occupied = builder.occupied;
    }

    public static class Builder {
        public final int number;
        public String name;
        public boolean occupied;

        public Builder(int number) {
            this.number = number;
        }

        public Runway build() {
            return new Runway(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setOccupied(boolean occupied) {
            this.occupied = occupied;
            return this;
        }
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public boolean isOccupied() {
        return occupied;
    }
}
