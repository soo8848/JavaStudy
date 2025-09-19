package com.parking.test;
import java.time.LocalDateTime;

import com.parking.dto.CarDTO;
import com.parking.service.ParkingFeeCalculator;

public class ParkingFeeCalculatorTest {

	public static void main(String[] args) {
		ParkingFeeCalculator parkingFeeCalculator = new ParkingFeeCalculator();
		
		String carNumber="11가1111";
		LocalDateTime entranceTime = LocalDateTime.of(2025, 8, 4, 19, 0, 0);
        LocalDateTime exitTime = LocalDateTime.of(2025, 8, 12, 9, 0, 1);
        
        CarDTO car = new CarDTO(carNumber, entranceTime, exitTime);

        long fee = parkingFeeCalculator.calculateFee(car);
        System.out.println("차량 " + car.getCarNumber() + " 총 요금: " + fee + "원");

	}

}
