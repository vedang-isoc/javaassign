package Customlamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Usecase {
	public static void main(String[] args) {
		List<Employee> emps=new ArrayList<>();


		Employee e=new Employee(183, "Vedang");
		Employee e1=new Employee(117, "Kishan");
		Employee e2=new Employee(177, "Devang");
		Employee e3=new Employee(145, "John");
		Employee e4=new Employee(145, "John");
		Comparator<Employee> idc1;
		
		emps.add(e);emps.add(e1);emps.add(e2);emps.add(e3);
		//emps.forEach(i->System.out.println(i));
		//IdCompare idc=new IdCompare();
		//Collections.sort(emps,idc1=(a,b)-> a.getCode()-b.getCode());
		Collections.sort(emps,new NameCompare());

		emps.forEach(i->System.out.println(i));
		//System.out.println(emps);
		System.out.println(emps.contains(e4));
		
		
		
		
		List<Superstars> s=new ArrayList<>();
		Superstars s1=new Superstars("Shraddha Kapoor", 32);
		Superstars s2=new Superstars("Tom Cruise", 55);
		Superstars s3=new Superstars("Emma Stone", 30);
		
		s.add(s1);s.add(s2);s.add(s3);
		
		Collections.sort(s);
		s.forEach(i->System.out.println(i));
	}
}
