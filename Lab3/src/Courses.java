import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;


import org.junit.Test;

//Write/fix the code as needed to remove warnings/errors and complete the lab 
public class Courses {
	ArrayList <Course>courses = new ArrayList<>();
	
	void loadCourses(){
		courses.add(new Course("COSC","111","Computer Programming I","",""));
		courses.add(new Course("COSC","121","Computer Programming II","","111"));
		courses.add(new Course("COSC","222","Data Structures","","121"));
	}
	
	public List<String> listAll(){
		List<String> list = new ArrayList<>();
		Course c;
		for (int i=0; i < courses.size(); i++){
			c = courses.get(i);
			c = (Course) courses.get(i);
			System.out.println(c.accr + " " + c.number + " " + c.title );
			list.add(c.accr + " " + c.number + " " + c.title);
			
		}
		return list;
	}
	
	void displayCourse(String number){
		if("COSC 222".equals(number)) {
		System.out.println("COSC 222 Data Structures");
		System.out.println("Introduction to the design, implementation and analysis of data structures. Topics will include lists, stacks, queues, trees, and graphs. [3-2-0]");
		System.out.println("Prerequisite: A score of 60% or higher in COSC 121.");
		}
	} 
	
	public List<String> listAlllter() {
		Course c;
		List<String> list = new ArrayList<>();
		Iterator<Course> it = courses.iterator();
		while(it.hasNext()) {
			 c = it.next();
			System.out.println(c.accr + " " + c.number + " " + c.title);
			list.add(c.accr + " " + c.number + " " + c.title);
		}
		return list;
	}
	public List<String> listAllStream(){
		List<String> list = courses.stream().map(course -> course.accr + " " + course.number + " " + course.title).collect(Collectors.toList());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		return list;	
	}
	
	public int countstored() {
		int count = (int)courses.stream().count();
		System.out.println("Total class amount" + count);
		return count;
	
	}
	
	public List<String> databasecontain() {
	List<String> it = new ArrayList();
	int i =0;
	while(i<courses.size()) {
		if(courses.get(i).getDesc().contains("database"))
			it.add(courses.get(i).getAccr() + " " + courses.get(i).getNumber() + " " + courses.get(i).getTitle());
		i++;
	}
	return it;
			
	}
	
	public List<Course> sortCourse() {
		return courses.stream().sorted(Comparator.comparing(Course::getNumber)).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		Courses L = new Courses();
		L.loadCourses();
		L.displayCourse("222");
		L.listAll();
		L.listAlllter();
		L.listAllStream();
		
	}

}
