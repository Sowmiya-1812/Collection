package CollectionHashMap;

import java.util.HashMap;

public class Employee {
	public static void main(String[] args) {
		int empid1 = 1;
		int empid2 = 2;
		int empid3 = 3;
		String empName1 = "Ishu";
		String empName2 = "Sri";
		String empName3 = "Raju";
		HashMap<Integer,String>employees = new HashMap<>();
		employees.put(empid1,empName1);
		employees.put(empid2, empName2);
		employees.put(empid3, empName3);
//		System.out.println(employees);
//		System.out.println(employees.keySet());
//		System.out.println(employees.values());
		System.out.println(employees.get(empid1));
		
		
//		for(Integer x : employees.keySet()) {
//		System.out.println(x);
//		System.out.println(employees.get(x));
		//}
		
		
//		for(String e : employees.values()) {
//			System.out.println(e);
//		}
		
		
		
		//employees.forEach((x,y)->System.out.println(x+" "+y));
		//jmemployees.keySet().forEach(x->System.out.println(x+" "+employees.get(x)));
		//employees.values().forEach(y->System.out.println(y));
		
	}

}
