package dsa_practice.scenario_based;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
class InsufficientLeaveBalance extends Exception{
	 public InsufficientLeaveBalance(String message) {
		// TODO Auto-generated constructor stub
		 super(message);
	}
}
class LeaveRequest{
	private String leavetype;
	private String reason;
	public String getLeavetype() {
		return leavetype;
	}

	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	private int days;
	
	 LeaveRequest(String leaveType,String reason,int days) {
		// TODO Auto-generated constructor stub
		 this.leavetype=leaveType;
		 this.reason=reason;
		 this.days=days;
	}
	
}
class Employee{
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAvailableLeaves() {
		return availableLeaves;
	}

	public void setAvailableLeaves(int availableLeaves) {
		this.availableLeaves = availableLeaves;
	}

	private String id;
	private int availableLeaves;
	
	Employee(String name,String id,int availableLeaves){
		this.name=name;
		this.id=id;
		this.availableLeaves=availableLeaves;
	}
}

public class EmployeeLeaveManagementSystem {

    static HashMap<String, Employee> employees = new HashMap<>();
    static List<LeaveRequest> leaveRequests = new ArrayList<>();
    public static void processLeave(String empId, LeaveRequest request)throws InsufficientLeaveBalance {
        Employee emp = employees.get(empId);
        if (request.getDays()>emp.getAvailableLeaves()) {
            throw new InsufficientLeaveBalance("Not enough leave balance!");
        }
        emp.setAvailableLeaves(emp.getAvailableLeaves() - request.getDays());
        leaveRequests.add(request);
        System.out.println("Leave Approved for "+emp.getName());
    }
    public static void main(String[] args) {
        Employee e1=new Employee("Anurag","E101",5);
        employees.put("E101",e1);
        LeaveRequest lr=new LeaveRequest("Casual","Personal", 6);
        try {
            processLeave("E101",lr);
            System.out.println("Remaining Leaves: "+e1.getAvailableLeaves());
        } catch (InsufficientLeaveBalance e) {
            System.out.println(e.getMessage());
        }
    }
}
