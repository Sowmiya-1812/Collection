package CollectionHashMap;

import java.util.HashMap;

public class UseBankCustomer {
	public static void main(String[] args) {
		BankCustomer bc1 = new BankCustomer(12345678910l,"Sowmiya",27,"SBI",true,"SBI100134");
		BankCustomer bc2 = new BankCustomer(98765432104l,"Iswarya",22,"HDFC",false,"HDFC876543");
		BankCustomer bc3 = new BankCustomer(76543289105l,"Sridevi",25,"UNION",true,"UNI10000765");
		BankCustomer bc4 = new BankCustomer(89652964328l,"Harshini",28,"ICICI",false,"ICIC100654");
		BankCustomer bc5 = new BankCustomer(234098765433l,"Kayal",30,"PUNJAB",true,"PUN1678659");
		HashMap<Long,BankCustomer>customers = new HashMap<>();
		customers.put(bc1.getaccountNumber(),bc1);
		customers.put(bc2.getaccountNumber(),bc2);
		customers.put(bc3.getaccountNumber(),bc3);
		customers.put(bc4.getaccountNumber(),bc4);
		customers.put(bc5.getaccountNumber(),bc5);
		
		//customers.put(bc1.getaccountNumber(),bc2);
		//customers.forEach((x,y)->System.out.println(customers));
		
		//customers.remove(bc1.getaccountNumber());
		//System.out.println(customers);
		//customers.forEach((x,y)->System.out.println(y));
		
		for(Long x : customers.keySet()) {
		System.out.println(customers.get(x));
		}
		
		
	}

}
