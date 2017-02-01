package br.edu.univas.si.lab4.exinterface.model;

import br.edu.univas.si.lab4.exinterface.interfaces.Accelerating;

public class Bicycle implements Accelerating {

	private Float currentSpeed = 0f;
	private static Float MAX_SPEED = 60f; //supposing is KM

	@Override
	public void speedUp(Float speed) {
		if(speed <= Accelerating.MAX_PERCENT) {
			calculatingSpeed(speed);
		}
	}


	@Override
	public void speedDown(Float speed) {
		if(speed >= Accelerating.MIN_PERCENT) {
			calculatingSpeed(speed);
		}
	}

	private void calculatingSpeed(Float speed) {
		this.currentSpeed = MAX_SPEED * (speed/100);
	}
	
	@Override
	public Float currentSpeed() {
		return this.currentSpeed;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getCanonicalName().replace("br.edu.univas.si.lab4.exinterface.model.", "");
		
	}

}
