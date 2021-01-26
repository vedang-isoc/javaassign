
public interface Advanced {
		void some(int a);
		default void printsome(){
			System.out.println("hi");
		}
		static void prints(){
			System.out.println("static");
		}
}
