package day5;

public class CreateObject9 {
	//initial objects
	Employee thai = new Employee();
	Department QA = new Department();
	
	//create class for object employee
	public class Employee{
		private int employeeID;
		private String employeeName;
		private String empDescription;
		
		//EmployeeID getter
		public int getEmployeeID() {
			return employeeID;
			
		}
		//EmployeeID setter
		public void setemployeeID(int employeeID){
	        this.employeeID = employeeID;
		}
		//EmployeeName getter
		public String getEmployeeName() {
			return employeeName;
		}
		//EmployeeName setter
		public void setEmployeeName(String employeeName){
	        this.employeeName = employeeName;
	        //rethis.empDescription = empDescription;
		}
		//Employee Description getter
		public String getEmpDesscription() {
			return empDescription;
		}
		public void setempDescription(String empDescription){
	        this.empDescription = empDescription;
		}
	}
	
	//create class for object Department
	public class Department{
		private int departmentID;
		private String departmentName;
		private String departmentDesc;
		
		//departmentID getter
		public int getDepartmentID() {
			return departmentID;
			
		}
		//departmentID setter
		public void setDepartmentID(int departmentID){
	        this.departmentID = departmentID;
		}
		//departmentName getter
		public String getDepartmentName() {
			return departmentName;
		}
		//departmentName setter
		public void setDepartmentName(String departmentName){
	        this.departmentName = departmentName;
		}
		//department Description getter
		public String getDepartmentDesc() {
			return departmentDesc;
		}
		public void setDepartmentDesc(String departmentDesc){
	        this.departmentDesc = departmentDesc;
		}
	}
}
