package kosta.oop;

public class Member {

	String name;
	int age;
	
	//디폴트 생성자
	//파라미터값을 넣지 않는 것을
	public Member(){} //디폴트 생성자
	
	//항상 생성자를 만들때 ↑ 디폹 생성자를 만들자
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void print() {
		System.out.println("이름" +name);
		System.out.println("나이" + age);
	}

	
}
