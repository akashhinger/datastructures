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

public final class ImmutableEmployeeClass {
	
private final String name;
private final int id;
private final List<Address> addr;
ImmutableEmployeeClass(String name, int id, final List<Address> addr){
	this.name= name;
	this.id=id;
	this.addr= addr;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1= new Address("bangalore");
		Address a2= new Address("delhi");
		List<Address> list= new ArrayList();
		list.add(a2);
		list.add(a1);
		ImmutableEmployeeClass emp= new ImmutableEmployeeClass("Akash",1,list);
		System.out.println(emp.getAddr());

		List<Address> list2= emp.getAddr();
		list2.add(a2);
		
		System.out.println(emp.getAddr().size());
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public List<Address> getAddr() {
		List<Address> newaddr= new LinkedList<Address>(addr);
		return newaddr;
	}

}
