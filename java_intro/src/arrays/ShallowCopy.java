package arrays;
class department{
	String name;

	public department(String name) {
		super();
		this.name = name;
	}
	
}
class employe implements Cloneable{
	int id;
	String name;
	public employe(int id, String name, department dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	department dept;
  
  @Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

	
}
public class ShallowCopy {

	public static void main(String[] args)throws CloneNotSupportedException {
		
		department d = new department("IT");
		employe e1 = new employe(1,"sai",d);
		employe e2 = (employe)e1.clone();
		e2.id=2;
		e2.name="rahul";
		e2.dept.name="hr";

		System.out.println("******** employee 1*********");
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.dept.name);

		System.out.println("******** employee 2*********");
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.dept.name);
		
		
		
           
	}

}
