
public class Measure {

	private String name;
	private int minValue;
	private int maxValue;
	private int waterFrezze;
	
	public Measure(String name, int minValue, int maxValue, int waterFrezee) {
		this.name = name;
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.waterFrezze = waterFrezee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public int getWaterFrezze() {
		return waterFrezze;
	}

	public void setWaterFrezze(int waterFrezze) {
		this.waterFrezze = waterFrezze;
	}
	
	
	
}
