
public class Student {
	private String name;
	public void eat() {
		System.out.println("吃饭");
	}
	public static void main(String[] args) {
		SuperStudent superStudent
		 = new SuperStudent(new Student());
		superStudent.play();
	}
}
class SuperStudent{
	private Student student;
	public  SuperStudent(Student student) {
		this.student = student;
	}
	public void play() {
		System.out.println("喝酒");
		student.eat();
	}
}