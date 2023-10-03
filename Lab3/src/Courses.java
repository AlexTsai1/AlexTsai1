import java.util.ArrayList;

//Write/fix the code as needed to remove warnings/errors and complete the lab 
public class Courses {
	ArrayList courses = new ArrayList<>();
	
	void loadCourses(){
		courses.add(new Course("COSC","111","Computer Programming I","",""));
		courses.add(new Course("COSC","121","Computer Programming II","","111"));
		courses.add(new Course("COSC","222","Data Structures","","121"));
	}
	
	public void listAll(){
		Course c;
		for (int i=0; i < courses.size(); i++){
			c = courses.get(i);
			System.out.println(c.accr + " " + c.number + " " + c.title );
		}
	}
	
	void displayCourse(String number){
		
	} 
	
	public static void main(String[] args) {
		Courses L = new Courses();
		L.loadCourses();
		L.listAll();
	}

}
