
public class Employee
{

	


	protected String name;
	protected int id;
	protected double baseSalary;
	
	
	public Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public void setBaseSalary(double baseSalary)
	{
		this.baseSalary=baseSalary;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
	return id;
		
	}
	 public double getSalary()
	 {
		 return baseSalary;
	 
	 }
	 public double getBaseSalary()
	 {
		 return baseSalary;
	 }
	 }

