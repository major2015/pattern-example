package com.iblog.pattern.responsibilityChain;

public class Solution {
    private final String id;
    private final String serviceId;
    private final boolean solved;
    private final String solvedBy;

    private Solution(Builder builder) {
        this.id = builder.id;
        this.serviceId = builder.serviceId;
        this.solved = builder.solved;
        this.solvedBy = builder.solvedBy;
    }

    public static class Builder {
        public String id;
        public final String serviceId;
        public boolean solved;
        public String solvedBy;

        public Solution build() {
            return new Solution(this);
        }

        public Builder(String serviceId) {
            this.serviceId = serviceId;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setSolved(boolean solved) {
            this.solved = solved;
            return this;
        }

        public Builder setSulvedBy(String solvedBy) {
            this.solvedBy = solvedBy;
            return this;
        }
    }

    public String getId() {
        return id;
    }

    public String getServiceId() {
        return serviceId;
    }

    public boolean isSolved() {
        return solved;
    }

    public String getSolvedBy() {
        return solvedBy;
    }
}
