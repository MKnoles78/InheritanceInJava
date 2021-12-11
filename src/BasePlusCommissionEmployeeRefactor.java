//private superclass members cannot be accessed in a subclass
public class BasePlusCommissionEmployeeRefactor extends CommissionEmployee {
	private double baseSalary; // base salary per week

	// six-argument constructor
	public BasePlusCommissionEmployeeRefactor(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double commissionRate, double baseSalary) {
		// explicit call to superclass CommissionEmployee constructor
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

	}

}
