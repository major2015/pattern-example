package com.iblog.pattern.responsibilityChain;

public class Service {
    private final ServiceCategory category;
    private final String id;
    private final String description;

    private Service(Builder builder) {
        this.category = builder.category;
        this.id = builder.id;
        this.description = builder.description;
    }

    public static class Builder {
        public final ServiceCategory category;
        public String id;
        public String description;

        public Service build() {
            return new Service(this);
        }

        public Builder(ServiceCategory category) {
            this.category = category;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }
    }


    public ServiceCategory getCategory() {
        return category;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
