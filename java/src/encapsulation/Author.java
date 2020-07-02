package encapsulation;

public class Author {
	private String name;
	private String mail;
	private char gender;
	public Author(String name,String mail,char gender){
		this.name=name;
		this.mail=mail;
		this.gender=gender;
		
		
	}
	public String getName() {
		return name;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public char getGender() {
		return gender;
	}
	

}
