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
	}

}
