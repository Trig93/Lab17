import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountriesApp {
	
	private static FileHelper<Country> helper = new FileHelper<>("country.txt", new CountryLineConverter());

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		String name = null;
		int population = 0;
		boolean goAgain = true;
		List<Country> allCountries = helper.readAll();
		System.out.println("Welcome to Trig's Tiny Country App!");
		do {
		MenuMethod.menuMethod();
		System.out.println("Please enter the corresponding menu number to begin:");
		int userInput = scnr.nextInt();
		if (userInput == 2) {
			System.out.println("Please enter the name and population of the new country:");
			helper.rewrite(Arrays.asList(new Country(name, population)));
			name = scnr.next();
			population = scnr.nextInt();
			helper.append(new Country(name, population));
			System.out.println("Would you like to enter another country? y/n");
			String userContinue = scnr.next().toLowerCase();
			if (userContinue.startsWith("y")) {
				userInput = 2;
			}else {
				MenuMethod.menuMethod();
				System.out.println("Please enter the corresponding menu number to proceed:");
				userInput = scnr.nextInt();
			}
		}else if (userInput == 1) {
			for(Country p : allCountries) {
				System.out.println(p);
			}
			System.out.println("Would you like to do anything else? y/n");
			String userContinue = scnr.next().toLowerCase();
			if (userContinue.startsWith("y")) {
				MenuMethod.menuMethod();
				System.out.println("Please enter the corresponding menu number to begin:");
				userInput = scnr.nextInt();
			}else {
				goAgain = false;
			}
		}else if (userInput == 3) {
			System.out.println("Goodbye.");
			goAgain = false;
		}		
		}while (goAgain = true);
	}
}	

