package course;

public class AuxArrayVector2 {
	String name;
	String mail;
		
	public AuxArrayVector2(String name, String mail) {
		super();
		this.name = name;
		this.mail = mail;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String toString() {
		return name + ", " + mail;
	}
	
	
	
}
