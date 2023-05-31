Hii There,

NSG Rule Creation is a program to create rule for Subnet which helps them to communicate with eachother in Cloud Environments.

For example, On Azure Cloud we can see the a rule which Subnets uses, " allow-inbound-https-appSubnet-dbSubnet-001 ",
here, we are allowing Application Subnet to communicate with Database Subnet, with "inbound" - giving the direction of flow,
HTTPS being the protocol over this communication is taking place, 001 is being used as index to separate similar rule in network.

Syntax can be, allow-<direction>-<protocol>-<subnetname>-<subnetname>-<indexifany> , this can be used as general systax for NSG Rule.

Rule can be given for 2 Direction, 1. Inbound(inbound) 2. Outbound(outbound)
 
Program is an attempt to create multiple Inbound/Outbound rule for Subnet given in one go.

Program is written in Java.

Try this program and give your feedback. Thank You.
 

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 Your Frindly Friend,
 SachinTayade
