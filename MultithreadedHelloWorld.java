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

public class MultithreadedHelloWorld {
	static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultithreadedHelloWorld mt=new MultithreadedHelloWorld();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				mt.printHello();
			}
		},"Thread1");
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				mt.printWorld();
			}
		},"Thread2");
		t1.start();
		t2.start();

	}

	protected void printWorld() {
		synchronized (this) {
			// TODO Auto-generated method stub
			while (count < 100) {
				while (count % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("world " + "from " + Thread.currentThread().getName());
				count++;
				notify();
			}
		}
		
	}

	protected void printHello() {
		synchronized (this) {
			// TODO Auto-generated method stub
			while (count < 100) {
				while (count % 2 != 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Hello " + "from " + Thread.currentThread().getName());
				count++;
				notify();
			}
		}
		
	}

}
