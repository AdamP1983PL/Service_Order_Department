package com.service_order.service.vehicle_service;

import com.service_order.client.VehicleApiClient;
import com.service_order.service.dto.vehicle_dto.VehicleDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleApiServiceImpl implements VehicleApiService {

    private final VehicleApiClient vehicleApiClient;

    public VehicleApiServiceImpl(VehicleApiClient vehicleApiClient) {
        this.vehicleApiClient = vehicleApiClient;
    }

    @Override
    public List<VehicleDto> findAllVehicles() {
        return vehicleApiClient.findAllVehicles();
    }

    @Override
    public VehicleDto findVehicleById(Long id) {
        return vehicleApiClient.findVehicleById(id);
    }

    @Override
    public VehicleDto findVehicleByVIN(String vin) {
        return vehicleApiClient.findVehicleByVIN(vin);
    }

    @Override
    public VehicleDto findVehicleByRegistrationNumber(String number) {
        return vehicleApiClient.findVehicleByRegistrationNumber(number);
    }

}
