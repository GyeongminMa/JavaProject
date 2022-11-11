package chapter07homework;

public class EmpDept extends Employee {

	//필드
	public String department;
	
	//생성자
	
	public String getDepartment() {
		return department;
	}
	public EmpDept(String name,int salary,String department) {
		super(name,salary);
		this.department = department;
	}

	
	

	@Override
	public void getInformation() {
		System.out.println("이름: " + name);
		System.out.println("연봉: " + salary);
		System.out.println("부서: " + department);
		
	}

	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
		
	}
		
	
	
	
}
