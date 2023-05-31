/*

Subnets - s1 , s2 , s3 , s4 ,............
subnetA - s0 , s1 , s3 , s4 ,............

InRule - ir0 , ir2 , ir3 ......

*/

import java.util.*;
import java.io.*;

public class NRCv1
{
	static int NoS = 0;
	static int innerloop = 0;

	static int noofsubs = 0;

	static String[] subnames = new String[20];

	static	int TnoIO = 0;
	static	int NoIn = 0;
	static	int NoOut = 0;

	static	String[] InRule = new String[100];
	static	String[] OutRule = new String[100];

	static	int tostoreIn = 0;
	static	int tostoreOut = 0;

	static	int posIn = 0;
	static	int posOut = 0;

	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\n");

		System.out.println("\t\tNSG Rule Creation\n");

		System.out.print("Enter the Number of Subnets - ");

		NoS = sc.nextInt();

		System.out.print("\n");

		System.out.println("Enter Name for "+NoS+" Subnets : ");

		for(int i = 0 ; i < NoS ; i++)
		{
			int c = 1;
			c = c+i;
			System.out.print("Enter Name for "+c+"st Subnet - ");
			subnames[i] = sc.next();
		}

		System.out.print("\n");

		for(int i = 0 ; i < NoS ; i++)
		{
			System.out.println("Name of Subnets : "+subnames[i]);
		}

		System.out.print("\n");	

		for(int i = 0 ; i < NoS ; i++)
		{

			System.out.print("\n");
			
			System.out.print("Enter Total Number of Inbound/Outbounds for "+subnames[i]+" Subnet - ");
			TnoIO = sc.nextInt();

			System.out.print("\n");

			System.out.print("Enter Number of Inbound for "+subnames[i]+" Subnet - ");
			NoIn = sc.nextInt();

			System.out.print("Enter Number of Outbound for "+subnames[i]+" Subnet - ");
			NoOut = sc.nextInt();

			if(TnoIO == (NoIn+NoOut))
			{
				System.out.print("\n");

				//INBOUND//

				System.out.print("Number of Inbound for "+subnames[i]+" Subnet - "+NoIn);

				System.out.print("\n");

				tostoreIn += NoIn;

				for(int in = 0 ; in < NoIn ; in++)
				{
					System.out.print("\n");

					System.out.println("Enter Inbound from Subnets Name - ");
					String InSubName = sc.next();
					System.out.println("Eneter Inbound Protocol - ");
					String InProc = sc.next();

					//allow-inbound-https-any-apps-001//
					InRule[posIn+in] = "allow-inbound-"+InProc+"-"+InSubName+"-"+subnames[i]+"-001";
				}

				posIn += NoIn;

				System.out.print("\n");

				System.out.print("Number of Outbound for "+subnames[i]+" Subnet -"+NoOut);

				tostoreOut += NoOut;

				for(int io = 0 ; io < NoOut ; io++)
				{
					System.out.print("\n");

					System.out.println("Enter Outbound to Subnet Name - ");
					String OutSubname = sc.next();
					System.out.println("Eneter Outbound Protocol - ");
					String OutProc = sc.next();

					//allow-outbound-https-apps-pl-001//
					OutRule[posOut+io] = "allow-outbound-"+OutProc+"-"+subnames[i]+"-"+OutSubname+"-001";
				}

				posOut += NoOut;

				System.out.print("\n");
			}
			else
			{
				System.out.println("Please enter correct Inbound/Outbound for "+subnames[i]+" Subnet");
			}

		}

		System.out.print("\n");


			//System.out.print("Inbound/Outbound for "+subnames[j]+" Subnet :");

			System.out.print("\n");			

			for(int ir = 0 ; ir < tostoreIn ; ir++)
			{
				System.out.print("\n");				
				System.out.println("Inbound Rules : "+InRule[ir]);
			}

			System.out.print("\n");

			for(int or = 0 ; or < tostoreOut ; or++)
			{	
				System.out.print("\n");
				System.out.println("Outbound Rules : "+OutRule[or]);
			}

		System.out.print("\n");

		

		sc.close();
	}
}








































