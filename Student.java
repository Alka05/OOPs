package oops;

public class Student {
	
	private int id;
	private String name ;
	private String section;
	
	//This is an empty  constructor
	
	public Student() {
		super();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	//public is a access modifier,String is a return type, getName is a method 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", section=" + section + "]";
	}
	
	
	
}
