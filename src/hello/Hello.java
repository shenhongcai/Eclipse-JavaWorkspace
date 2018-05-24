package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// 输出一句话
	while(true) {	
		Scanner in=new Scanner(System.in);
      
	          String str;
	          str=in.nextLine();
	    
	     switch (str) {
	     
	     case"HIT": System.out.println("哈尔滨工业大学");
	     break;
	     
	     case"MIT": System.out.println("麻省理工大学");
	     break;
	     
	     default: System.out.println("请重新输入学校简称:");
	    
	     }
	     
	    
	} 
	


	}

}
