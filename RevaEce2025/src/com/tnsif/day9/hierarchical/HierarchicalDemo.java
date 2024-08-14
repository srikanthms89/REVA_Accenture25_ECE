package com.tnsif.day9.hierarchical;

public class HierarchicalDemo {

	public static void main(String[] args) {

		Person p ;
		
		p = new Student("kumar","bangalore","102","ECE");
	
		 if (p instanceof Student)
		 System.out.println(p);
		 
		 p = new Employee("madhu","Bangalore","IT",1000000);
		 if( p instanceof Employee)
			 System.out.println(p);
		 
		 

	}

}
