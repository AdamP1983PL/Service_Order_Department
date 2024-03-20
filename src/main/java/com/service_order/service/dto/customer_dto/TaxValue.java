package com.service_order.service.dto.customer_dto;

import lombok.Getter;

@Getter
public enum TaxValue {
    ZERO(0), TWENTY_THREE(23);

    private final int value;

    TaxValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
