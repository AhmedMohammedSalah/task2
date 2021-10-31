
public class stuff extends empolyee {
	private String title ;
	public stuff(String name, String adress, String phone, String email, int office, double sallarey,
			String title  ,int d,int m , int y) {
		super(name, adress, phone, email, office, sallarey, d,m,y);
		this.title =title;
		// TODO Auto-generated constructor stub
	}
	private String className = this.getClass().getName();
	public String toString () {
		return(className + ":" +super.getName()  );
	}
	
	
}
