import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

public class FlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list = new ArrayList();
		list.add(List.of(1,2,3));
		list.add(List.of(1,2,3));
		list.add(List.of(1,2,3));
		System.out.println(list);
		System.out.print(list.stream().flatMap(num->num.stream()).collect(Collectors.toList()));
	}

}
