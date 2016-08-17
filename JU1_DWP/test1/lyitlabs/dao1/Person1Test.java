package lyitlabs.dao1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Person1Test extends Person1 {

	Person1 p; 

	@Before
	public void setUp() throws Exception {
		   p = new Person1("Joe","Bloggs", 10);  
		 
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPerson() {
		assertNotNull(p);
	}
    @Test
	public void testPersonStringStringInt() {
	fail("Not yet implemented");
	}
	@Test
	public void testGetFirstName() throws NoSuchFieldException, IllegalAccessException {  
		//Testing getters using reflection  
		final Person1 p2 = new Person1();  
		final java.lang.reflect.Field field = p2.getClass().getDeclaredField("FirstName");  
		field.setAccessible(true);      
		field.set(p2, "Sean");        
		final String result = p2.getFirstName();  
		assertEquals("Field not properly retrieved.", result, "Sean");
}

	@Test
	public void testSetFirstName()  throws NoSuchFieldException, IllegalAccessException
	{   //Testing setters using reflection     
		final Person1 p2 = new Person1("Pricopie","Daniela francesca",5);      
		p2.setFirstName("Daniela francesca");                
		final java.lang.reflect.Field field = p2.getClass().getDeclaredField("FirstName");     
		field.setAccessible(true);    
		assertEquals("Fields do not match each other.", field.get(p2), "Sean"); 

	}

	@Test
	public void testGetLastName()  throws NoSuchFieldException, IllegalAccessException {  
		//Testing getters using reflection  
		final Person1 p2 = new Person1();  
		final java.lang.reflect.Field field = p2.getClass().getDeclaredField("LastName");  
		field.setAccessible(true);      
		field.set(p2, "Dockerty");        
		final String result = p2.getLastName();  
		assertEquals("Field not properly retrieved.", result, "Dockerty");
		
	}

	@Test
	public void testSetLastName()  throws NoSuchFieldException, IllegalAccessException
	{   //Testing setters using reflection     
		final Person1 p2 = new Person1("aine","doherty",5);      
		p2.setLastName("Dockerty");                
		final java.lang.reflect.Field field = p2.getClass().getDeclaredField("LastName");     
		field.setAccessible(true);    
		assertEquals("Fields do not match each other.", field.get(p2), "Dockerty"); 
		
	}

	@Test
	public void testGetAge() 
	{
		
	}

	@Test
	public void testSetAge()
	{
		p.setAge(12); 
		assertTrue(p.getAge() == 12); 
	}
}
