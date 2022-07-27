import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 *  $URL$
 *  $Date$
 *  
 *  $Copyright-Start$
 *
 *  Copyright (c) 2022
 *  JDA Corporation
 *  All Rights Reserved
 *
 *  This software is furnished under a corporate license for use on a
 *  single computer system and can be copied (with inclusion of the
 *  above copyright) only for use on such a system.
 *
 *  The information in this document is subject to change without notice
 *  and should not be construed as a commitment by JDA Corporation.
 *
 *  JDA Corporation assumes no responsibility for the use of the
 *  software described in this document on equipment which has not been
 *  supplied or approved by JDA Corporation.
 *
 *  $Copyright-End$
 */

public class Employee2 {

	private String name;
	private int id;
	private int salary;
	Employee2(String name, int id, int salary){
		this.name= name;
		this.id=id;
		this.salary= salary;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			List<Employee2> list=new LinkedList<>();
			Employee2 emp1= new Employee2("Akash",1,20000);
			Employee2 emp2= new Employee2("manish",2,30000);
			Employee2 emp3= new Employee2("skshay",3,40000);
			list.add(emp1);
			list.add(emp2);
			list.add(emp3);
			long count = list.stream().filter(emp->emp.getName().startsWith("s")).filter(emp->emp.getSalary()>20000).count();
			System.out.println("Count: "+count);
		}
		public String getName() {
			return name;
		}
		public int getId() {
			return id;
		}
		public int getSalary() {
			
			return salary;
		}

}
