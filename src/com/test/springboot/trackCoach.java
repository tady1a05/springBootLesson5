package com.test.springboot;

public class trackCoach implements Coach{
	FortunateServices fs;
	
	public trackCoach(FortunateServices fs) {
		this.fs = fs;
	}
	
	@Override
	public String doWorkout() {
		// TODO Auto-generated method stub
		return "Run 100 km";
	}
	
	public String doFortunate() {
		return fs.doFortunate();
	}
	
}
