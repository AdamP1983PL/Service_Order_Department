package com.service_order.service.dto.vehicle_dto;

import lombok.Getter;

@Getter
public enum EngineType {
    UNKNOWN("UNKNOWN"),
    DIESEL("DIESEL"),
    PETROL("PETROL"),
    HYBRID("HYBRID"),
    ELECTRIC("ELECTRIC");

    private final String displayText;

    EngineType(String displayText) {
        this.displayText = displayText;
    }

}
