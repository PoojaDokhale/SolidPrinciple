package OpenClosed;

public class TrainedEmployee extends Employee {
	String trainingArea;

	public TrainedEmployee(String id, String name, String trainingArea) {
		super(id, name);
		this.trainingArea = trainingArea;
	}

	public String getTrainingArea() {
		return trainingArea;
	}

	@Override
	public String toString() {
		return "TrainedEmployee [trainingArea=" + trainingArea + ", id=" + id + ", name=" + name + "]";
	}

	public void setTrainingArea(String trainingArea) {
		this.trainingArea = trainingArea;
	}

}
