package com.fantest;

public class CeilingFanPullChain {
	
	private SpeedLevel currentSpeed;
	private String currentDirection;
	
	public CeilingFanPullChain() {
		this.currentSpeed = new Off();
		this.currentDirection="Forward";
	}
	public void setCurrentState(SpeedLevel cs) {
		currentSpeed = cs;
	}
	public String getCurrentDirection() {
		return currentDirection;
	}
	public void setCurrentDirection(String currentDirection) {
		this.currentDirection = currentDirection;
	}
	public void pull() {
		currentSpeed.pull(this);
    }
	@Override
	public String toString() {
		return "CeilingFanPullChain [currentState=" + currentSpeed + "]";
	}
	
}
