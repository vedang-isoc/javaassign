import java.awt.List;
import java.util.ArrayList;

public class Usecase {
	public static void main(String[] args) {
		Functionality f=new Functionality();
		f.printsome();
		f.some(122);

		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(12);
		nums.add(23);
		nums.add(45);
		nums.add(17);
		nums.forEach(i->System.out.println(i));


		Lamda l=new Lamda();
		l.add();

		FunInterface fi=new FunInterface() {
			public void add() {
				System.out.println("Anonymus");
			}
		};
		FunInterface fi1=()->{
			System.out.println("Hello lamda");
		};
		
		FunInterface fi2=()->System.out.println("Very short form");
		
		fi2.add();
		fi.add();
		fi1.add();


	}

}
