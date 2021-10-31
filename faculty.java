
public class faculty extends empolyee{
	private double officeHours;
	private double rank ;
	public faculty(String name, String adress, String phone, String email, int office, double sallarey ,double officeHours,double rank ,int d,int m , int y) {
		super(name, adress, phone, email, office, sallarey, d, m ,  y);
		this.officeHours=officeHours;
		this.rank=rank;
		// TODO Auto-generated constructor stub
	}
	private String className = this.getClass().getName();
	public String toString () {
		return(className + ":" +super.getName()  );
	}
	
	
}
