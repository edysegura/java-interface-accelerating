package br.edu.univas.si.lab4.exinterface.controller;

import java.util.ArrayList;

import br.edu.univas.si.lab4.exinterface.interfaces.Accelerating;
import br.edu.univas.si.lab4.exinterface.model.Airplane;
import br.edu.univas.si.lab4.exinterface.model.Bicycle;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Accelerating> acceleratings = new ArrayList<Accelerating>();

		Airplane airplane = new Airplane();
		Bicycle bicycle = new Bicycle();

		acceleratings.add(airplane);
		acceleratings.add(bicycle);

		gradativeAcceleration(acceleratings);
	}

	private static void gradativeAcceleration(ArrayList<Accelerating> acceleratings) {
		Float currentSpeed = null;

		for (Accelerating accelerating : acceleratings) {
			for (int i = 0; i < 12; i++) {
				accelerating.speedUp(10F * i);
				currentSpeed = accelerating.currentSpeed();
				System.out.println("Type: " + accelerating);
				System.out.println("Current speed: " + currentSpeed);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("-------------------------------");
			}
		}

	}

}
