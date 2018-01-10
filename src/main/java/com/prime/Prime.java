package com.prime;
import java.util.Scanner;


public class Prime {

	public static void main(String[] args) {
		int start_number=2,last_Number;
		String count_Prime="";
		
		
		Scanner input_last=new Scanner(System.in);
		System.out.println(input_last);
		System.out.println("Enter the Count of Prime");
		last_Number=input_last.nextInt();
		
		for(int i= start_number; i<= last_Number;i++)
			{
				int counter=0;
				for(int j=i;j>=2;j--)
					{
						if(i%j==0)
						{
							counter=counter+1;
						}
					}
				if (counter==1)
				{
					count_Prime=count_Prime+i+ " ";
					
				}
			}
		System.out.println("New Changes");
		System.out.println("Prime number fro 1 to "+last_Number);
		System.out.println(count_Prime);

	}

}
