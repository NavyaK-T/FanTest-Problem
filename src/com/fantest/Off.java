package com.fantest;

public class Off implements SpeedLevel {

	@Override
	public void pull(CeilingFanPullChain pullChain) {
		pullChain.setCurrentState(new SpeedLevelOne());
		System.out.println("Speed level 1 with direction "+pullChain.getCurrentDirection());
	}

}
