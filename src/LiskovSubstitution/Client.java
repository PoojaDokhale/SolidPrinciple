package LiskovSubstitution;

public class Client {
	public static void main(String[] args) {
		Client c1=new Client();
		Employee e1 = new Employee("23", "POOJA");

		c1.usemeToPrint(e1);
		TrainedEmployee e2 = new TrainedEmployee("23", "POOJA", "Pune");
		//child class should be completely substitutable of parent
		c1.usemeToPrint(e2);
	}

	private void usemeToPrint(Employee e) {
		e.printMe();
	}

}
