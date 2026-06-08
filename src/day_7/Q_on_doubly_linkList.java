package day_7;



//Wap to perfrom below opreation on employee doubly linklist
// Onboeard the new employee at the begining
// Display the details
// offboard the employee
// update the details
//delete the employee from the end




public class Q_on_doubly_linkList {

	public static void main(String[] args) {
		
		
		

		    

		        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

		       
		        list.insertAtBeginning(101, "ayush");
		        list.insertAtBeginning(102, "Manthan");
		        list.insertAtBeginning(103, "Aditi");

		        System.out.println("Employee List:");
		        list.display();

		      
		        System.out.println("\nAfter Updating:");
		        list.updateEmployee(102, "Priya");
		        list.display();

		     
		        System.out.println("\nAfter Deleting Employee ID 101:");
		        list.deleteByEmpId(101);
		        list.display();

		      
		        System.out.println("\nAfter Deleting Last Employee:");
		        list.deleteFromEnd();
		        list.display();
		    }
		
		
	}

		class EmployeeNode {
		    int empId;
		    String empName;
		    EmployeeNode next;
		    EmployeeNode prev;

		    EmployeeNode(int empId, String empName) {
		        this.empId = empId;
		        this.empName = empName;
		        next = null;
		        prev = null;
		    }
		}

		class EmployeeDoublyLinkedList {

		    EmployeeNode head;

		    public void insertAtBeginning(int empId, String empName) {

		        EmployeeNode newNode = new EmployeeNode(empId, empName);

		        if (head == null) {
		            head = newNode;
		            return;
		        }

		        newNode.next = head;
		        head.prev = newNode;
		        head = newNode;
		    }

		 
		    public void display() {

		        if (head == null) {
		            System.out.println("Employee list is empty");
		            return;
		        }

		        EmployeeNode temp = head;

		        while (temp != null) {
		            System.out.println("Employee ID : " + temp.empId);
		            System.out.println("Employee Name : " + temp.empName);
		            System.out.println("-------------------");
		            temp = temp.next;
		        }
		    }

		   
		    public void deleteByEmpId(int empId) {

		        if (head == null) {
		            System.out.println("List is empty");
		            return;
		        }

		        EmployeeNode temp = head;

		        while (temp != null) {

		            if (temp.empId == empId) {

		              
		                if (temp == head) {
		                    head = head.next;

		                    if (head != null) {
		                        head.prev = null;
		                    }
		                }

		              
		                else if (temp.next == null) {
		                    temp.prev.next = null;
		                }

		              
		                else {
		                    temp.prev.next = temp.next;
		                    temp.next.prev = temp.prev;
		                }

		                System.out.println("Employee deleted successfully");
		                return;
		            }

		            temp = temp.next;
		        }

		        System.out.println("Employee ID not found");
		    }

		   
		    public void updateEmployee(int empId, String newName) {

		        EmployeeNode temp = head;

		        while (temp != null) {

		            if (temp.empId == empId) {
		                temp.empName = newName;
		                System.out.println("Employee updated successfully");
		                return;
		            }

		            temp = temp.next;
		        }

		        System.out.println("Employee ID not found");
		    }

		   
		    public void deleteFromEnd() {

		        if (head == null) {
		            System.out.println("List is empty");
		            return;
		        }

		        if (head.next == null) {
		            head = null;
		            System.out.println("Last employee removed");
		            return;
		        }

		        EmployeeNode temp = head;

		        while (temp.next != null) {
		            temp = temp.next;
		        }

		        temp.prev.next = null;

		        System.out.println("Last employee removed");
		    
	}
}

		