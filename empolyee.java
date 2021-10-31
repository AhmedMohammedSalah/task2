
public class empolyee extends person {
private int office;
private double sallary;

private MyDate date_hired ;
	public empolyee(String name ,String adress,String phone ,String email ,int office ,double sallarey ,int d,int m , int y) {
		super (name ,adress,phone,email);
		this.office =office ;
		this.sallary =sallary;
		date_hired=new MyDate(y,m,d); 
		
	}
	private String className = this.getClass().getName();
	public String toString () {
		return(className + ":" +super.getName()  );
	}
	
}
