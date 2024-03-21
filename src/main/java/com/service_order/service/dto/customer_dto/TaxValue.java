package com.service_order.service.dto.customer_dto;


public enum TaxValue {
    ZERO("0"),
    TWENTY_THREE("23");

    private final String displayText;

    TaxValue(String displayText) {
        this.displayText = displayText;
    }

    public String getDisplayText() {
        return displayText;
    }
}
