class PrintNumbers {
	static int number;
	int count=0;
	public void printEven() {
		synchronized(this){// TODO Auto-generated method stub
			while(count<number) {
				while(count%2!=0) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(count);
				count++;
				notify();
			}
		}
	}
	public void printOdd() {
		// TODO Auto-generated method stub
			synchronized(this) {
				while(count<number) {
					while(count%2==0) {
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println(count);
					count++;
					notify();
				}
			}
		}


public static void main(String [] args){
	number=100;
	PrintNumbers t1 = new PrintNumbers();
	Thread thr1=new Thread(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			t1.printEven();
		}
		
	});
	Thread thr2=new Thread(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			t1.printOdd();
		}
		
	});
	thr1.start();
	thr2.start();
	
}}


