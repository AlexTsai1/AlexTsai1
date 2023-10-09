import static org.junit.Assert.assertEquals;


import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;



public class CourseTest {
	Courses courses = new Courses();
	
	@Before
    public void setUp() {
        courses.loadCourses();
    }
	
	@Test
	public void testAllmethods() {
		 List<String> listAllIterResult = courses.listAlllter();
	        List<String> listAllStreamResult = courses.listAllStream();
	        
	        assertEquals(courses.listAll(), listAllIterResult);
	        assertEquals(courses.listAll(), listAllStreamResult);
	        assertEquals(listAllIterResult, listAllStreamResult);	
	}
	@Test
 	public void counttest() {
 		int count = courses.countstored();
 		assertEquals(3,count);
 	}
	
	 @Test
	   public void databaseTest() {
	        Courses c = new Courses();
	        c.loadCourses();
	        assertEquals(0, c.databasecontain().size());
	    }
	
	 }
	    
	

