package com.company.oo.lambda;

import java.util.function.Supplier;

public class Thermometre {
	
	private int temperature;

	public Thermometre(int temperature) {
		super();
		this.temperature = temperature;
	}

	public int getTemperature() {
		return temperature;
	}
	
	
	public void mettreDansEau(Supplier<String> messageGetter) throws InterruptedException {
		
		while(temperature < 100) {
			Thread.sleep(10);
			temperature++;
		}
		
		String message = messageGetter.get();
		System.out.println( message );
		
	}
	
	
	
	

}
