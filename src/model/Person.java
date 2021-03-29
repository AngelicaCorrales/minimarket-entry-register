package model;

public class Person {
	private String typeId;
	private String numbId;
	
	public Person(String typeId, String numbId) {
		this.typeId = typeId;
		this.numbId = numbId;
	}
	
	public String getTypeId() {
		return typeId;
	}
	
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	
	public String getNumbId() {
		return numbId;
	}
	
	public void setNumbId(String numbId) {
		this.numbId = numbId;
	}
	
}
