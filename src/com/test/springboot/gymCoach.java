package com.test.springboot;

public class gymCoach implements Coach{
	FortunateServices fs;
	
	public gymCoach(FortunateServices fs) {
		this.fs = fs;
	}
	
	@Override
	public String doWorkout() {
		// TODO Auto-generated method stub
		return "do gym, 30 sit up";
	}
	
	@Override
	public String doFortunate() {
		return fs.doFortunate();
	}

}
