public class person {
	private String name ;
	private String adress ;
	private String phone  ;
	private String email  ;

	public person(){
			
	}
	public person(String name ,String adress,String phone ,String email){
		this.name =name;
		this.phone = phone ;
		this.adress = adress ;
		this.email=email;
	}
	public String getName () {
		return (name);
	}

	private String className = this.getClass().getName();
	public String toString () {
		return(className + ":" + name  );
	}

}
