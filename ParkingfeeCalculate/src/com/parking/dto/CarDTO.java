package com.parking.dto;
import java.time.LocalDateTime;

public class CarDTO {
	private String carNumber;
	private LocalDateTime entranceTime;
	private LocalDateTime exitTime;

    public CarDTO(String carNumber, LocalDateTime entranceTime, LocalDateTime exitTime) {
        this.carNumber = carNumber;
        this.entranceTime = entranceTime;
        this.exitTime = exitTime;
    }

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public LocalDateTime getEntranceTime() {
		return entranceTime;
	}

	public void setEntranceTime(LocalDateTime entranceTime) {
		this.entranceTime = entranceTime;
	}

	public LocalDateTime getExitTime() {
		return exitTime;
	}

	public void setExitTime(LocalDateTime exitTime) {
		this.exitTime = exitTime;
	}

	@Override
	public String toString() {
		return "CarDTO [carNumber=" + carNumber + ", entranceTime=" + entranceTime + ", exitTime=" + exitTime + "]";
	}
}
