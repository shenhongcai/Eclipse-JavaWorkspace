package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// ���һ�仰
	while(true) {	
		Scanner in=new Scanner(System.in);
      
	          String str;
	          str=in.nextLine();
	    
	     switch (str) {
	     
	     case"HIT": System.out.println("��������ҵ��ѧ");
	     break;
	     
	     case"MIT": System.out.println("��ʡ����ѧ");
	     break;
	     
	     default: System.out.println("����������ѧУ���:");
	    
	     }
	     
	    
	} 
	


	}

}
