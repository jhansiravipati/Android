

public class AndroidPhone {
	private int phonePrice;
	private int screenSize;
	private double thickness;
	private boolean isAudioJackPresent;
	private String phoneName;
	private String phoneBrand;
	
	
	
	void buildPhone() {
		
	}

	public int getPhonePrice() {
		return phonePrice;
	}

	public void setPhonePrize(int phonePrice) {
		this.phonePrice = phonePrice;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public double getThickness() {
		return thickness;
	}

	public void setThickness(double thickness) {
		this.thickness = thickness;
	}

	public boolean isAudioJackPresent() {
		return isAudioJackPresent;
	}

	public void setAudioJackPresent(boolean isAudioJackPresent) {
		this.isAudioJackPresent = isAudioJackPresent;
	}

	public String getPhoneBrand() {
		return phoneBrand;
	}

	public void setPhoneBrand(String phoneBrand) {
		this.phoneBrand = phoneBrand;
	}

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	
	void myAwsomePhone() {
		System.out.println(phonePrice);
		System.out.println(screenSize);
		System.out.println(thickness);
		System.out.println(isAudioJackPresent);
		System.out.println(phoneName);
		System.out.println(phoneBrand);
	}
	
	void buildPhone(int price,int size,double thickness, boolean audiojack,String name, String brand ) {
		phoneBrand=brand;
		phoneName=name;
		phonePrice= price;
		screenSize=size;
		this.thickness=thickness;
		isAudioJackPresent=audiojack;
		
		
		
	}

}
