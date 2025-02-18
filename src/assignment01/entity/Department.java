package assignment01.entity;

public class Department {
	private Long departmentID;
	private String departmentName;

	public Department() {
	}
	
	public Department (String departmentName) {
		this.departmentName = departmentName;
		this.departmentID = 0L;
	}
	
	public Department(Long departmentID, String departmentName) {
		this.departmentID = departmentID;
		this.departmentName = departmentName;
	}
	
	public Department(Long departmentID) {
		this.departmentID = departmentID;
	}

	public Long getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(Long departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + "]";
	}

}
