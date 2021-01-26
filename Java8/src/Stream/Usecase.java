package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Customlamda.Employee;
import Customlamda.Superstars;

public class Usecase {
	public static void main(String[] args) {
		List<Employee> emps=new ArrayList<>();


		Employee e=new Employee(183, "Vedang");
		Employee e1=new Employee(117, "Kishan");
		Employee e2=new Employee(177, "Devang");
		Employee e3=new Employee(137, "Kishan");
		Employee e5=new Employee(179, "Karan");

		emps.add(e);emps.add(e1);emps.add(e2);emps.add(e3);emps.add(e5);
		
		//emps.stream().forEach(i->System.out.println(i));
		System.out.println(emps.stream().max((a,b)->a.getCode()-b.getCode()));
		System.out.println(emps.stream().anyMatch(a->a.getName()=="John"));
		//emps.stream().distinct().forEach(i->System.out.println(i));
		emps.stream().filter(a->a.getName().charAt(0)=='K').forEach(i->System.out.println(i));
		
		
		
		
		List<Superstars> s=new ArrayList<>();
		Superstars s1=new Superstars("Shraddha Kapoor", 32);
		Superstars s2=new Superstars("Tom Cruise", 55);
		Superstars s3=new Superstars("Emma Stone", 30);
		
		s.add(s1);s.add(s2);s.add(s3);
		
		s.stream().sorted().forEach(i->System.out.println(i));
		
	}
	

}
