package QuizeApplication;

import java.util.Scanner;

public class Sample3 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Sample s=new Sample();
		System.out.println("enter a value ");
		int i=sc.nextInt();
		if(i==1) {
		System.out.println("start game");
		}else {
		System.out.println("stop game");
}
	}
}