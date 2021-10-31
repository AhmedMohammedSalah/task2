/**
 * 
 */

/**
 * @author Ahmed Mohamed Salah
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p=new person ("Ahmed ","ELminia","010233232311","amhmadosfdafla@gmail.com");
		System.out.println(p.toString());
		student s =new student ("Alaa ","ELminia","010233232311","amhmadosfdafla@gmail.com");
		System.out.println(s.toString());
		empolyee em =new empolyee ("Asmaa ","ELminia","010233232311","amhmadosfdafla@gmail.com",12,3000.0,2021,7,1);
		System.out.println(em.toString());
		faculty f =new faculty ("ISlam","ELminia","010233232311","amhmadosfdafla@gmail.com",12,3000.0,12,0.3,2021,7,1);
		System.out.println(f.toString());
		stuff sf =new stuff ("Ahlam ","ELminia","010233232311","amhmadosfdafla@gmail.com",12,3000.0,"degree3",2021,7,1);
		System.out.println(sf.toString());
		
	
	
	}

}
