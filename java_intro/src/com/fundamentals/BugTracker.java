package com.fundamentals;

public class BugTracker {
	int BugID;
	String ApplicationName;
	String BugTitle;
	String severity;
	int priority;
	String status;
	String assigned_dev;
	int getbugid(){
		return BugID;
	}
	String ApplicationName() {
		return ApplicationName;
	}
	String BugTitle() {
		return BugTitle;
	}
	String severity( ) {
		return severity;
		
	}
	int getPriority() {
		return priority;
		
	}
	String getStatus() {
		return status;
	}
	String assignedev() {
		return assigned_dev;
	}
	void update_status(String st){
		status=st;
	}
	void assignDev(int bgid,String name) {
		BugID=bgid;
		assigned_dev=name;
		update_status("in dev");
	}
	void display_sum() {
		System.out.println(" application name :"+ApplicationName());
		System.out.println(" dev name :"+assignedev());
		System.out.println("bug id :"+getbugid());
		System.out.println("bug title "+BugTitle());
		System.out.println("severity :"+severity( ));
		System.out.println("priority :"+getPriority());
		System.out.println("status :"+getStatus());
		
	}
	

	public static void main(String[] args) {
		BugTracker b=new BugTracker();
		b.ApplicationName="loan ease";
		b.BugID=101;

		b.BugTitle="login-function";
		b.severity="High";
		b.priority=1;
		b.status="assinged ";
		b.assigned_dev="sai";
		b.display_sum();
		
	    b.assignDev(b.BugID,"shiva");
	    b.display_sum();
	    
	    
	    
	    
	    }

}
