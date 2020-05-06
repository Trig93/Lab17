
/**
 * An implementation of LineConverter that converts Player objects
 */
public class CountryLineConverter implements LineConverter<Country> {

	@Override
	public String toLine(Country object) {

		
		return object.getName()+"\t"+object.getPop();
		
	}

	@Override
	public Country fromLine(String line) {
		
		String[] parts = line.split("\t");
		String name = parts[0];
		int pop = Integer.parseInt(parts[1]);

		
		return new Country(name, pop);
	}

	

}
