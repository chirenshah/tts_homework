package helloworld;
import java.util.*;

public class Maps {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>(); 
		map.put("Blazer", "Chevrolet");
        map.put("Bentayga", "Bentley");
        map.put("Camry", "Toyota");
        map.put("Challenger", "Dodge");
        map.put("Discovery", "Land Rover");
        Scanner scan = new Scanner(System.in);
        System.out.println("What make are you looking for ?");
        String model = scan.next();
        System.out.println("Oh, you're looking for a " + model +"? Our " + map.get(model) +" selection is right over here...");
        scan.close();
	}
}
