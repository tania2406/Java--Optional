package DSA;

import java.util.Optional;

// Optional is a container object which may or may not contain a non-null value. 

class Student
{
	int id;
	String name;
	String email;
	String city;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + "]";
	}
	// Getter-Setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int id, String name, String email, String city) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
	}
	
}

	
public class optional 
{
	public static void main(String args[])
	{
		Student e=new Student(12,null,"kk@gmail.com",null);
		Optional<Student> bee=Optional.of(e);
		if(bee.isPresent())
			{System.out.println(bee.get().getEmail());
			}
		else
			System.out.println("no value");
	String msg=null;
		Optional<String> op=Optional.ofNullable(msg);
		System.out.println(op.isPresent());
		System.out.println(op.orElse("no value found"));
		System.out.println(op.orElseGet(()->"no value is here present"));
		//System.out.println(op.orElseThrow(()-> new IllegalArgumentException("illegal argument exception")));
		
			}
					
	}


