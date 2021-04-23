package com.fantest;

public class SpeedLevelTwo implements SpeedLevel {

	@Override
	public void pull(CeilingFanPullChain pullChain) {
		pullChain.setCurrentState(new SpeedlevelThree());
		System.out.println("Speed level 3 with direction "+pullChain.getCurrentDirection());
	}

}
