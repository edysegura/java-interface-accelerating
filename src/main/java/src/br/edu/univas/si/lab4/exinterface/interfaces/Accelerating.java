package br.edu.univas.si.lab4.exinterface.interfaces;

/**
 * Example about the interfaces in Java
 * Interfaces are 100% abstract
 */
public interface Accelerating {
	
	//constants in java, only this is accepted in the interfaces
	public final int MIN_PERCENT = 0;
	public final int MAX_PERCENT = 100;
	
	//method when have to implemented
	public void speedUp(Float speed);
	public void speedDown(Float speed);
	public Float currentSpeed();
	
}
