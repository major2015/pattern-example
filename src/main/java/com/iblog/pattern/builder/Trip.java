package com.iblog.pattern.builder;

public class Trip {
    private final String id;
    private final String owner;
    private final String departure;
    private final String destination;
    private final long amount;
    private final long expiredAt;
    private final String createdBy;
    private final long createdAt;
    private final String lastUpdatedBy;
    private final long lastUpdatedAt;

    private Trip(Builder builder) {
        this.id = builder.id;
        this.owner = builder.owner;
        this.departure = builder.departure;
        this.destination = builder.destination;
        this.amount = builder.amount;
        this.expiredAt = builder.expiredAt;
        this.createdBy = builder.createdBy;
        this.createdAt = builder.createdAt;
        this.lastUpdatedBy = builder.lastUpdatedBy;
        this.lastUpdatedAt = builder.lastUpdatedAt;
    }

    public Builder toBuilder() {
        return new Builder()
                .setId(this.id)
                .setOwner(this.owner)
                .setDeparture(this.departure)
                .setDestination(this.destination)
                .setAmount(this.amount)
                .setExpiredAt(this.expiredAt)
                .setCreatedBy(this.createdBy)
                .setCreatedAt(this.createdAt)
                .setLastUpdatedBy(this.lastUpdatedBy)
                .setLastUpdatedAt(this.lastUpdatedAt);
    }

    public static class Builder {
        private String id;
        private String owner;
        private String departure;
        private String destination;
        private long amount;
        private long expiredAt;
        private String createdBy;
        private long createdAt;
        private String lastUpdatedBy;
        private long lastUpdatedAt;

        /**
         * In actual combat, you can define the required fields as final types,
         * then set fields values through this constructor method.
         */
        public Builder() {}

        public Trip build() {
            return new Trip(this);
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder setDeparture(String departure) {
            this.departure = departure;
            return this;
        }

        public Builder setDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder setAmount(long amount) {
            this.amount = amount;
            return this;
        }

        public Builder setExpiredAt(long expiredAt) {
            this.expiredAt = expiredAt;
            return this;
        }

        public Builder setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder setCreatedAt(long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setLastUpdatedBy(String lastUpdatedBy) {
            this.lastUpdatedBy = lastUpdatedBy;
            return this;
        }

        public Builder setLastUpdatedAt(long lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }
    }

    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public long getAmount() {
        return amount;
    }

    public long getExpiredAt() {
        return expiredAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public long getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    @Override
    public String toString() {
        // you can cover this method.
        return super.toString();
    }
}
