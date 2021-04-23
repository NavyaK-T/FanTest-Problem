package com.fantest;

public class SpeedlevelThree implements SpeedLevel {

	@Override
	public void pull(CeilingFanPullChain pullChain) {
		pullChain.setCurrentState(new Off());
		System.out.println("Turning off with direction "+pullChain.getCurrentDirection());

	}

}
