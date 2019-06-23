package com.MicHon.carFactory;

import static com.MicHon.carFactory.WheelPosition.LEFT;

public class ContinentalFactory implements Factory {

    WheelPosition wheelPosition = LEFT;

    public Ford createFord(CarModel carModel) {
        switch (carModel) {
            case FOCUS:
                return new Ford(2019, 2000, "Petrol", wheelPosition);
            case CMAX:
                return new Ford(2019, 1900, "Diesel", wheelPosition);
            default:
                throw new UnsupportedOperationException("Unknown model");
        }
    }

    public BMW createBMW(CarModel carModel) {
        switch (carModel) {
            case X5:
                return new BMW(2019, 2000, "Diesel", wheelPosition);
            case E60:
                return new BMW(2019, 1900, "Petrol", wheelPosition);
            default:
                throw new UnsupportedOperationException("Unknown model");
        }
    }
}
