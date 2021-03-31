package model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import exceptions.NoDayException;
import exceptions.UnderAgeException;

class MinimarketTest {
	private Minimarket minimarket;
	
	public void setupScenary1() {
		minimarket=new Minimarket();
	}
	
	public void setupScenary2() {
		minimarket=new Minimarket();
		minimarket.addPerson("CC", "16707893");
		minimarket.addPerson("PP", "31962220");
		minimarket.addPerson("CE", "1088457");
		minimarket.addPerson("CC", "31974540");
		
	}
	
	
	@Test
	public void testRegister1() {
		setupScenary1();
		int typeId= Minimarket.TI;	
		String numbId= "1006892770";
		
		boolean registered=true;
		try {
			minimarket.register(typeId, numbId);
			fail("UnderAgeException expected");

		} catch (UnderAgeException uae) {
			registered=false;
		} catch (NoDayException nde) {
			fail("UnderAgeException expected");
		}
		
		assertFalse(registered);
		ArrayList<Person> peopleRegistered=minimarket.getPeopleRegistered();
		assertEquals(0, peopleRegistered.size());
	}
	
	@Test
	public void testRegister2() {
		setupScenary2();
		int typeId= Minimarket.TI;	
		String numbId= "1006892770";
		
		boolean registered=true;
		try {
			minimarket.register(typeId, numbId);
			fail("UnderAgeException expected");

		} catch (UnderAgeException uae) {
			registered=false;
		} catch (NoDayException nde) {
			fail("UnderAgeException expected");

		}
		
		assertFalse(registered);
		ArrayList<Person> peopleRegistered=minimarket.getPeopleRegistered();
		assertEquals(4, peopleRegistered.size());
	}
	
	@Test
	public void testRegister3() {
		setupScenary1();
		int typeId= Minimarket.CC;	
		String numbId= "43081586";
		
		boolean registered=true;
		try {
			minimarket.register(typeId, numbId);
		} catch (UnderAgeException uae) {
			fail("UnderAgeException not expected");

		} catch (NoDayException nde) {
			registered=false;
		}
		
		ArrayList<Person> peopleRegistered=minimarket.getPeopleRegistered();
		int day= LocalDate.now().getDayOfMonth(); 
	
		if(day%2==0) {
			assertFalse(registered);
			assertEquals(0, peopleRegistered.size());


		}else {
			assertTrue(registered);
			assertEquals(1, peopleRegistered.size());
			
			Person person=peopleRegistered.get(0);
			assertEquals("CC", person.getTypeId());
			assertEquals(numbId, person.getNumbId());
		}
		
	}
	
	@Test
	public void testRegister4() {
		setupScenary2();
		int typeId= Minimarket.CC;	
		String numbId= "43081586";
		
		boolean registered=true;
		try {
			minimarket.register(typeId, numbId);
		} catch (UnderAgeException uae) {
			fail("UnderAgeException not expected");

		} catch (NoDayException nde) {
			registered=false;
		}
		
		ArrayList<Person> peopleRegistered=minimarket.getPeopleRegistered();
		int day= LocalDate.now().getDayOfMonth(); 
	
		if(day%2==0) {
			assertFalse(registered);
			assertEquals(4, peopleRegistered.size());


		}else {
			assertTrue(registered);
			assertEquals(5, peopleRegistered.size());
			
			Person person=peopleRegistered.get(4);
			assertEquals("CC", person.getTypeId());
			assertEquals(numbId, person.getNumbId());
		}
		
	}
	
	@Test
	public void testRegister5() {
		setupScenary1();
		int typeId= Minimarket.CE;	
		String numbId= "774899";
		
		boolean registered=true;
		try {
			minimarket.register(typeId, numbId);
		} catch (UnderAgeException uae) {
			fail("UnderAgeException not expected");

		} catch (NoDayException nde) {
			registered=false;
		}
		
		ArrayList<Person> peopleRegistered=minimarket.getPeopleRegistered();
		int day= LocalDate.now().getDayOfMonth(); 
	
		if(day%2==0) {
			assertTrue(registered);
			assertEquals(1, peopleRegistered.size());
			
			Person person=peopleRegistered.get(0);
			assertEquals("CE", person.getTypeId());
			assertEquals(numbId, person.getNumbId());
		}else {
			assertFalse(registered);
			assertEquals(0, peopleRegistered.size());
		}
		
	}
	
	@Test
	public void testRegister6() {
		setupScenary2();
		int typeId= Minimarket.CE;	
		String numbId= "774899";
		
		boolean registered=true;
		try {
			minimarket.register(typeId, numbId);
		} catch (UnderAgeException uae) {
			fail("UnderAgeException not expected");

		} catch (NoDayException nde) {
			registered=false;
		}
		
		ArrayList<Person> peopleRegistered=minimarket.getPeopleRegistered();
		int day= LocalDate.now().getDayOfMonth(); 
	
		if(day%2==0) {
			assertTrue(registered);
			assertEquals(5, peopleRegistered.size());
			
			Person person=peopleRegistered.get(4);
			assertEquals("CE", person.getTypeId());
			assertEquals(numbId, person.getNumbId());


		}else {
			assertFalse(registered);
			assertEquals(4, peopleRegistered.size());
		}
		
	}

}
