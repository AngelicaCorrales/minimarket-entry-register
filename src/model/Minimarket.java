package model;

import java.time.LocalDate;
import java.util.ArrayList;

import exceptions.NoDayException;
import exceptions.UnderAgeException;

public class Minimarket {
	public final static int TI=1;
	public final static int CC=2;
	public final static int PP=3;
	public final static int CE=4;
	
	
	private ArrayList<Person> peopleRegistered;
	private int attemps;

	public Minimarket() {
		peopleRegistered=new ArrayList<Person>();
		attemps=0;
	}

	public ArrayList<Person> getPeopleRegistered() {
		return peopleRegistered;
	}

	public void setPeopleRegistered(ArrayList<Person> peopleRegistered) {
		this.peopleRegistered = peopleRegistered;
	}

	public int getAttemps() {
		return attemps;
	}

	public void setAttemps(int attemps) {
		this.attemps = attemps;
	}
		
	
	public void register(int typeId, String numbId) throws UnderAgeException, NoDayException{
		attemps++;
		String type="";
		if(typeId==TI) {
			throw new UnderAgeException();
		}
		switch(typeId) {
		case CC:
			type="CC";
			break;
		case PP:
			type="PP";
			break;
		case CE:
			type="CE";
			break;
		}
		
		int secondLastNumb=Character.getNumericValue(numbId.charAt(numbId.length()-2));
		int day= LocalDate.now().getDayOfMonth(); 
		
		if((secondLastNumb%2==0 && day%2==0) || (secondLastNumb%2!=0 && day%2!=0)) {
			throw new NoDayException(secondLastNumb, day);
		}
		
		Person person=new Person(type, numbId);
		peopleRegistered.add(person);
	}
	
}
