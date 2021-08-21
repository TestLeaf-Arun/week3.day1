package week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("My ID is " + id);
	}
	
	public void getStudentInfo(int id, String name)	{
		System.out.println("My name is " + name);
	}
	
	public void getStudentInfo(String email, int phoneNumber)	{
		System.out.println("Write to me @ " + email);
		System.out.println("U can contact me @ " + phoneNumber);
	}
	
	public static void main(String[] args) {
		Students studObj = new Students();
		studObj.getStudentInfo(555);
		studObj.getStudentInfo(555, "Arun");
		studObj.getStudentInfo("Training@TestLeaf.com", 123456789);
	}
}