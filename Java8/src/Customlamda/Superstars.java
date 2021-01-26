package Customlamda;

public class Superstars implements Comparable<Superstars>{
	private String name;
	private int age;
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
	public Superstars(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Superstars [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Superstars arg0) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(arg0.getName());
	}

}
