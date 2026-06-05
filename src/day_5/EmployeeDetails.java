package day_5;


	public class EmployeeDetails {

	    public static void main(String[] args) {

	        Employee emp1 = new Employee("xyz", 1);
	        EmployeeDetailNode empNode1 = new EmployeeDetailNode(emp1);

	        Employee emp2 = new Employee("abc", 2);
	        EmployeeDetailNode empNode2 = new EmployeeDetailNode(emp2);

	        Employee emp3 = new Employee("pqr", 3);
	        EmployeeDetailNode empNode3 = new EmployeeDetailNode(emp3);

	        // Link nodes
	        empNode1.next = empNode2;
	        empNode2.next = empNode3;

	        // Print details
	        System.out.println("First Employee: " + empNode1.data);
	        System.out.println("Second Employee: " + empNode2.data);
	        System.out.println("Third Employee: " + empNode3.data);

	        // Traverse Linked List
	        System.out.println("\nTraversing Linked List:");

	        EmployeeDetailNode temp = empNode1;

	        while (temp != null) {
	            System.out.println(temp.data);
	            temp = temp.next;
	        }
	    }
	}

	class Employee {

	    String name;
	    int empId;

	    public Employee(String name, int empId) {
	        this.name = name;
	        this.empId = empId;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getEmpId() {
	        return empId;
	    }

	    @Override
	    public String toString() {
	        return "Employee [name=" + name + ", empId=" + empId + "]";
	    }
	}

	class EmployeeDetailNode {

	    Employee data;
	    EmployeeDetailNode next;

	    EmployeeDetailNode(Employee data) {
	        this.data = data;
	        this.next = null;
	    }
	}