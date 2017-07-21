package com.entertainment;

public class ColorTelevision extends Television {
	private int colorTint;

	public int getColorTint() {
		return colorTint;
	}

	public void setColorTint(int colorTint) {
		this.colorTint = colorTint;
	}
	
	public String toString() {
		
		return "Color " + super.toString() + " Tint = " + colorTint;
		
	}

	public ColorTelevision(String brandIn, int volumeIn, String channel, int tint) {
		super(brandIn, volumeIn,channel);
		setColorTint(tint);
		
	}

	public ColorTelevision() throws Exception {
		// TODO Auto-generated constructor stub
	}
}
