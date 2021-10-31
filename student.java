
public class student extends person  {
	private final String status="junior" ;
	student(String name ,String adress,String phone ,String email ){
		super (name ,adress,phone,email);
	}
	

	private String className = this.getClass().getName();
	public String toString () {
		return(className + ":" +super.getName()  );
	}
	public String getStatus() {
		return status;
	}

}
