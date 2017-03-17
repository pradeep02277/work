
public class EngineerStaff extends Employee {
    public EngineerStaff(String name, int id,double salary) {
		super(name, id);
		this.baseSalary = salary;
	
	}


	protected double bonusPercentage=10; 
    
    
    public double getSalary() {
    double baseSalary, salary;
    baseSalary = getBaseSalary();
    salary = baseSalary*bonusPercentage +
    		baseSalary;
    return(salary);
    	
    }
}
