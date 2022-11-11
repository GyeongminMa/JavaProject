package homework02;

public class ObesityInfo extends StandardWeightInfo {

	public double Obesity;
	
	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	public void getInformation() {
		System.out.println("이름: " + name + "신장:" +height + "몸무게:"+weight +getObesity());
	}
	public double getObesity() {
		Obesity = ((weight - getStandardWeight())/getStandardWeight() * 100);
		return Obesity;
	}

}
