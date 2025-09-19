
public class Student {
	private String StudentNumber;
	private String name;
	
	
	public Student(String StudentNumber, String name) {
		this.StudentNumber = StudentNumber;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [StudentNumber=" + StudentNumber + ", name=" + name + "]";
	}
	
	

}
