package basicutilities;

import com.google.common.collect.ComparisonChain;

public class Person implements Comparable<Person> {

	private String lastName;
	private String firstName;
	private int zipCode;

	@Override
	public int compareTo(Person that) {

		return ComparisonChain.start().compare(this.lastName, that.lastName).compare(this.firstName, that.lastName)
				.compare(this.zipCode, that.zipCode).result();
	}

}
