package homework02;

public class ObesityInfo extends StandardWeightInfo {

	public double Obesity;
	
	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	public void getInformation() {
		System.out.println("이름: " + name + "신장:" +height + "몸무게:"+weight +"비만정도"+getObesity());
	}
	public double getObesity() {
		Obesity = ((weight - getStandardWeight())/getStandardWeight() * 100);
		if(Obesity <= 18.5) {
			System.out.println("저체중");
		}else if(Obesity <=22.9) {
			System.out.println("정상");
		}else if(Obesity <=24.9) {
			System.out.println("과체중");
		}else if(Obesity <=29.9) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
		return Obesity;
	}

}
