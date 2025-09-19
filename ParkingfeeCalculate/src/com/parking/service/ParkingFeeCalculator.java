package com.parking.service;
import java.time.LocalDateTime;

import com.parking.dto.CarDTO;

import java.time.DayOfWeek;

public class ParkingFeeCalculator {
	private int PER_MINUTE_FEE = 100;
	private int PER_MINUTE = 10;
	
	public long calculateFee(CarDTO car) {
		LocalDateTime current = car.getEntranceTime();
		LocalDateTime exitTime = car.getExitTime();
        long totalMinutes = 0;

        while (current.isBefore(exitTime)) {
            if (isChargeableTime(current)) {
                totalMinutes++;
            }
            current = current.plusMinutes(1);
        }

        long units = totalMinutes / PER_MINUTE;
        return units * PER_MINUTE_FEE;
    }

	private boolean isChargeableTime(LocalDateTime current) {
        DayOfWeek day = current.getDayOfWeek();

        // �ָ� ����
        if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
            return false;
        }
        // ���� 08~20�� ���
        int hour = current.getHour();
        return (hour >= 8 && hour < 20);
    }
}
