import java.io.Serializable;
//Created a class Employee it implements Serializable
public class Employee implements Serializable {
	//declearing parameters
	private String empFirstName;
	private String empLastName;
	private static final long serialVersionUID = 42L;
	//Creating getters ans setters
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	
	}
	
	}

