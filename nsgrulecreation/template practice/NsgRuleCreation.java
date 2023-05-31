import java.util.Scanner;

public class NsgRuleCreation
{
	public static void main(String[] args)
	{
		int TnS = 0;
		String[] NfS = new String[10];
		int TnIOS = 0;
		int ItS = 0;
		int OfS = 0;

		String[] IsN = new String[30];
		String[] InPrC = new String[10];

		String[] OsN = new String[30];
		String[] OPrC = new String[10];

		String[] InRule = new String[100];
		String[] OutRule = new String[100];


		NsgRuleCreation nrc = new NsgRuleCreation();

		System.out.println("\n\tNSG RULE CREATION\n\n");

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Total No. of Subnets : ");	

		TnS = sc.nextInt();
		
		System.out.print("\n");

		for(int i = 0 ; i < TnS ; i++)
		{
			int c = i+1;
			System.out.print("Enter Name of "+c+"st Subnets : ");
			NfS[i] = sc.next();
		}

		System.out.print("\n");

		for(int i = 0 ; i < TnS ; i++)
		{
			int c = i+1;
			System.out.println("Name of "+c+"st Subnet - "+NfS[i]);
		}

		System.out.print("\n");

		for(int i = 0 ; i < TnS ; i++)
		{
			System.out.print("Enter Total Number of Inbound/Outbound for "+NfS[i]+" Subnet - ");

			TnIOS = sc.nextInt();

			System.out.print("\n");			

			System.out.print("Enter Number of Inbounds for "+NfS[i]+" Subnet - ");

			ItS = sc.nextInt();

			System.out.print("Enter Number of Outbounds for "+NfS[i]+" Subnet - ");

			OfS = sc.nextInt();

			if(TnIOS == (ItS+OfS))
			{
				System.out.print("\n");

				System.out.print("Inbound for "+NfS[i]+" Subnet - "+ItS);

				System.out.print("\n");

				for(int ia = 0 ; ia < ItS ; ia++)
				{
					int c = ia+1;
					System.out.print(c+"st Inbound from Subnet Name - ");
					IsN[i] = sc.next();

					System.out.print(c+"st Inbound from Protocol - ");
					InPrC[i] = sc.next();

					System.out.print(c+"st Inbound from Port - ");
					int PrT = sc.nextInt();

					//RULE - allow-inbound-https-any-apps-001

					InRule[i] = "allow-inbound-"+InPrC[i]+"-"+IsN[i]+"-"+NfS[i]+"-001";

					System.out.print("\n");
				}


				System.out.print("Outbound for "+NfS[i]+" Subnet - "+OfS);

				System.out.print("\n");

				for(int ib = 0 ; ib < OfS ; ib++)
				{
					int c = ib+1;
					System.out.print(c+"st Outbound to Subnet Name - ");
					OsN[i] = sc.next();

					System.out.print(c+"st Outbound to Protocol - ");
					OPrC[i] = sc.next();

					System.out.print(c+"st Outbound to from Port - ");
					int PrT = sc.nextInt();

					// RULE - allow-outbound-https-pl-any-001

					OutRule[i] = "allow-outbound-"+OPrC[i]+"-"+NfS[i]+"-"+OsN[i]+"-001"; 

					System.out.print("\n");
				}

			}
			else
			{
				System.out.println("Please enter Inbound/Outbound values correctly.");
				break;
			}

			System.out.print("\n");
	
		}

		for(int i = 0 ; i < TnS ; i++)
		{
			System.out.print("OUTSIDE BIG FOR LOOP\n");
			
			System.out.println("NSG Rule for "+NfS[i]+" Subnet - ");
			System.out.print("\n");

			System.out.print("\n");					
			System.out.println(InRule[i]);

			System.out.print("\n");

			System.out.print("\n");			
			System.out.println(OutRule[i]);
			
			System.out.print("\n");
		}


		sc.close();	
	}
}


















