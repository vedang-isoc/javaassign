package third;

public abstract class employee { //class which is incomplete
    //properties, instance variables
    private int id;
    private String name;
private int salary;
    
  
    //constructor, constructor overloading
  
    public employee(String name, int id,int salary){  //local variable
      
    	this.id = id;//generateId();
        this.name = name;
        this.salary = salary;
    }
   
    
   
    public String toString() {
    	return "Employee [id: "+ this.id+ ", name: "+ this.name + ",Salary: "+this.salary+ "]";
    }
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public abstract int getcompensation(); // no definition
}