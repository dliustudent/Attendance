package attendance;

public class Student implements Attendee {
	private String first;
	private String last;
	private boolean present;
	

public Student (String firstName, String lastName) {
	this.first = firstName;
	this.last = lastName;
	present = false;
}

public boolean isPresent() {
	if (present){
	return true;
	}
	return false;
}

public void setPresent(boolean present) {
	this.present = present;
}

public String getFirstName() {
	return first; 
}

public String getLastName() {
	return last;
}
@Override
public boolean matches(String first, String last) {
	return first.toLowerCase().equals(first.toLowerCase()) && last.toLowerCase().equals(last.toLowerCase());
}
@Override
public boolean matches(String last) {
	return last.toLowerCase().equals(last.toLowerCase());
}
@Override
public String getReportString() {
	String report = last;
	report = restrictStringToLength(report, 20);
	
	return null;
}

private String restrictStringToLength(String report, int i) {
	
	return null;
}
}
