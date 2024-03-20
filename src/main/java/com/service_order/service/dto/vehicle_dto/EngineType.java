package com.service_order.service.dto.vehicle_dto;

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

    public String getDisplayText() {
        return displayText;
    }
}
