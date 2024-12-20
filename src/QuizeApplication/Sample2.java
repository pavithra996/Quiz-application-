package QuizeApplication;

import java.util.Scanner;

public class Sample2 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Sample s=new Sample();
		System.out.println("enter the name:");
		String name=sc.nextLine();
		s.setname(name);
		System.out.println("enter the team:");
		String team=sc.nextLine();
		s.setteam(team);
		System.out.println("enter the email:");
		String email=sc.nextLine();
		s.setemail(email);
		System.out.println("enter the phno:");
		String phno=sc.nextLine();
		s.setphno(phno);
		System.out.println("enter the batch:");
		int batch=sc.nextInt();
		s.setbatch(batch);
		System.out.println(s.getname());
		
		System.out.println(s.getteam());
		
		System.out.println(s.getemail());
		
		System.out.println(s.getphno());
		
		System.out.println(s.getbatch());
	}
	}
		
		
	