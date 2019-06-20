package com.micHon.airLineBuilder;

import java.math.BigDecimal;

public class FlightLeg {

    private String from;
    private String to;
    private boolean delayed;
    private BigDecimal price;

    private FlightLeg(FlightLogBuilder flightLogBuilder) {
        this.from = flightLogBuilder.from;
        this.to = flightLogBuilder.to;
        this.delayed = flightLogBuilder.delayed;
        this.price = flightLogBuilder.price;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public boolean isDelayed() {
        return delayed;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    public static class FlightLogBuilder {

        private String from;
        private String to;
        private boolean delayed;
        private BigDecimal price;

        public FlightLogBuilder(String from, String to) {
            this.from = from;
            this.to = to;
            this.delayed = false;
        }

        public FlightLogBuilder buildPrice(String price) {
            this.price = new BigDecimal(price);
            return this;
        }

        public FlightLeg build() {

            if (this.price == null) {
                throw new IllegalStateException("Price tag is necessary");
            }
            return new FlightLeg(this);
        }
    }
}

