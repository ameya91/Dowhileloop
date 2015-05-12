package dowhiletable;

import java.io.DataInputStream;
import java.io.IOException;
public class dowhiletable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=0,i=0;
		System.out.println("Enter the number whose table is required:-");
		DataInputStream dis = new DataInputStream(System.in);
		try {
		num1 = Integer.parseInt(dis.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The table is as follows:- ");
		
		do{
			System.out.println(" ");
		System.out.println(num1 + "X" + i + "=" +(num1*i));
		i++;
		}while(i<=10);						
}

}
