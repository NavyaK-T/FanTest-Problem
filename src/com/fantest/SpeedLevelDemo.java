package com.fantest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpeedLevelDemo {

	public static void main(String[] args) {
		CeilingFanPullChain chain = new CeilingFanPullChain();
		String direction = chain.getCurrentDirection();
        while (true) {
        	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        	System.out.print("Enter direction to rotate in Forward/Reverse direction: ");
        	try { 
    			String readDirection = reader.readLine();
    			if(readDirection != null && !readDirection.isEmpty()) {
    				chain.setCurrentDirection(readDirection);
    				direction = readDirection;
    			}else {
    				chain.setCurrentDirection(direction);
    			}
    			
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
            System.out.print("Press ENTER to change the speed");
            getLine();
            chain.pull();
        }
	}
	private static String getLine() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;    
        try {
            line = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }
}
