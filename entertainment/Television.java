package com.entertainment;

public class Television implements Volume {

	private Tuner tuner = new Tuner();
	private String brand;
	private int volume;
	private boolean isMuted; 
	private int oldVolume;
	public static final int MIN_VOLUME = 0;
	public static final int MAX_VOLUME = 100;
	private static final int DEFAULT_VOLUME = 5;
	private static final String DEFAULT_BRAND = "RCA";
	
	
	
	// Constructor setting default values 
	public Television() throws Exception {
		//Television("RCA",10); // Is undefined error
		this(DEFAULT_BRAND,DEFAULT_VOLUME,"0");	}
	
	// Constructor allowing values to be set
		public Television(String brandIn) throws Exception {
			// Set the values using the setters in case there is logic to validate
			this.setBrand(brandIn);
			this.setVolume(DEFAULT_VOLUME);
		}
	
	// Constructor allowing values to be set
	public Television(String brandIn, int volumeIn, String channel) {
		// Set the values using the setters in case there is logic to validate
		try {
			this.setBrand(brandIn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setVolume(volumeIn);
		this.gotoChannel(channel);
	}
	
	/* Getters */
	public String getBrand() {
		return brand;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean isMuted() 
	{
		return isMuted;
	}
	
	public void gotoChannel(String channelIn)
	{
		tuner.setChannel(channelIn);
	}
	
	public String getCurrentChannel()
	{
		return tuner.getChannel();
	}
	public void mute()
	{
		if (!this.isMuted())
		{
			oldVolume = volume;
			volume = 0;
		}
		else 
		{
			volume = oldVolume;
		}
		isMuted = !isMuted;
	}
	
	/*  Setters */
	
	public void setBrand(String brand)  throws Exception
	{
		if (brand.equals("Sony") || 
			brand.equals("Zenith") || 
			brand.equals("Hitachi") ||
			brand.equals("LG") || 
			brand.equals("RCA"))
		{
			this.brand = brand;
		} else 
		{
			throw new Exception(brand + " is Invalid");
			//this.brand = DEFAULT_BRAND;
		}
	}
	
	/* Pull the minimal value between max and input then 
	   then pull the maximum value based on the minimum or what was 
	   determined from the max check
	 */
	public void setVolume(int volumeIn) {
	 
		volume = Math.max(MIN_VOLUME, Math.min(volumeIn,MAX_VOLUME));
	}
	
	
	@Override
	public String toString() {
		
		return "Television: brand = " + brand + " Volume = " + volume + " Channel = " + this.getCurrentChannel();
	}
}
