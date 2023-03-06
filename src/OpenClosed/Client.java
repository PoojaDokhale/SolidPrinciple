package OpenClosed;

public class Client {
	public static void main(String[] args) {
		Employee e1=new Employee("23", "POOJA");
		System.out.println(e1.toString());
		
		TrainedEmployee e2=new TrainedEmployee("23", "POOJA","Pune");
		System.out.println(e2.toString());
	}

}
