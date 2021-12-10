//BasePlusCommissionEmployee class represents an employee who receives a base salary in addition to commission

public class BasePlusCommissionEmployee {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage
	private double baseSalary; // base salary per week

	// six-argument constructor
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		// implicit call to Object's default constructor occurs here

		// if grossSales is invalid throw an exception
		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		// if commissionRate is invalid throw exception
		if (commissionRate <= 0.0 || commissionRate <= 1.0) {
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		// baseSalary is invalid throw exception
		if (baseSalary < 0.0) {
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

	}

}
