package sampleappl;

public class Sales {
	public void display() {
		int[] arr= {21,45,12,8};
		int sum=0;
		for(int num:arr) {
			sum+=num;
		
			System.out.println(num);
	}
		System.out.println(sum);
	
	}
	public void print() {
		System.out.println("Print all array numbers");
		display();
		System.out.println("hello");
	}
}
