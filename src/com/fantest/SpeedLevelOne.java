package com.fantest;

public class SpeedLevelOne implements SpeedLevel {

	@Override
	public void pull(CeilingFanPullChain pullChain) {
		pullChain.setCurrentState(new SpeedLevelTwo());
		System.out.println("Speed level 2 with direction "+pullChain.getCurrentDirection());

	}

}
