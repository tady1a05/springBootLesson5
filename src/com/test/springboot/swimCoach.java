package com.test.springboot;

public class swimCoach implements Coach{
	FortunateServices fs;
	
	public swimCoach(FortunateServices fs) {
		this.fs = fs;
	}
	
	@Override
	public String doWorkout() {
		// TODO Auto-generated method stub
		return "Swim 75m";
	}
	
	@Override
	public String doFortunate() {
		return fs.doFortunate();
	}
}
