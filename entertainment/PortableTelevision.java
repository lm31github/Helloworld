package com.entertainment;

public class PortableTelevision extends Television {
	private int rechargeLevel;

	@Override
	public String toString() {

		return "Portable " + super.toString() + " Charge = " + rechargeLevel;
	}

	public PortableTelevision(String brandIn, int volumeIn, String channel, int rechargeLevel)  {
		super(brandIn, volumeIn,channel);
	    setRechargeLevel(rechargeLevel);
	}

	public PortableTelevision() throws Exception {
		// TODO Auto-generated constructor stub
	}

	public int getRechargelevel() {
		return rechargeLevel;
	}

	public void setRechargeLevel(int rechargeLevel) {
		this.rechargeLevel = rechargeLevel;
	}
}
