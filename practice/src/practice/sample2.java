package practice;

import java.util.Random;
import java.util.Scanner;

public class sample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Your Phone Number:");
		String num = sc.nextLine();
		
		
		Random randomName = new Random();
		int id = randomName.nextInt(100,999);
		
		Scanner sca = new Scanner(System.in);
        System.out.println("Enter the package you want: "); 
        System.out.println("Full Day");
        System.out.println("One Night");
        System.out.println("Office Hours");
        System.out.println("Full Week");
        String pac = sca.nextLine();
        
        System.out.print("Are you a student: (Y/N)");
        String std = sca.nextLine().toLowerCase();
        String clz = "";
        if(std.equals("yes") || std.equals("y")) {
        	System.out.println("Enter your college name: ");
        	clz = sca.nextLine();
        }
        
        
        System.out.println("Name: " + name );
        System.out.println("Mobile no: " + num);
        System.out.println("Parking ID: " + id);
        
        System.out.println("Service Name :" + pac);
        System.out.println("Student (Y/N): " + std);
        
        if (pac.equals("full day")&&(std.equals("no") || std.equals("n"))){
            System.out.println("Fee: Rs400");
        }
           
        else if (pac.equals("full day") && (std.equals("yes") || std.equals("y"))){
        	System.out.println("College name:"+clz);
            System.out.println("Fee: Rs200");
     }
         else if (pac.equals("full week") && (std.equals("no")|| std.equals("n"))){
            System.out.println("Fee: Rs2000");    
        }
        
         else if (pac.equals("full week") && (std.equals("yes")|| std.equals("y"))){
        	 System.out.println("College name:"+clz);
            System.out.println("Fee: Rs1000");
         }
        else if (pac.equals("one night") && (std.equals("no") || std.equals("n"))){
            System.out.println("Fee: Rs500");
        }
        
        else if (pac.equals("one night") && (std.equals("yes") || std.equals("y"))){
        	System.out.println("College name:"+clz);
            System.out.println("Fee: Rs400");
        }
        
        else if (pac.equals("office hour") && (std.equals("no") || std.equals("n"))){
            System.out.println("Fee: Rs200");
        }
        
        else if (pac.equals("office hour") && (std.equals("yes") || std.equals("y"))){
        	System.out.println("College name:"+clz);
            System.out.println("Fee: Rs100");
        }
        
        else {
            System.out.println("Enter valid package. ");
            
        }
        
	}

}