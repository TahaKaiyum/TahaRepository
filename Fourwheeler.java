package org.vehi;

import javax.persistence.Entity;

@Entity
public class Fourwheeler extends Vehicle {
	private String steeringWheel;

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	public Fourwheeler() {
		super();
		
	}

}
