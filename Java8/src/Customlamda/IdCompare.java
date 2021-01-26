package Customlamda;

import java.util.Comparator;

public class IdCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee arg0, Employee arg1) {
		// TODO Auto-generated method stub
		return arg0.getCode()-arg1.getCode();
	}

	

}
