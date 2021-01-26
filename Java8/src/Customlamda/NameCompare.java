package Customlamda;

import java.util.Comparator;

public class NameCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee arg0, Employee arg1) {
		// TODO Auto-generated method stub
		//return arg0.hashCode()-arg1.hashCode();
		return arg0.getName().compareTo(arg1.getName());
	}

}
