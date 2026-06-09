package day_8;

import java.util.LinkedList;
import java.util.Queue;

// WAP to create the queue of print jobs and  display the details of jobs


public class Queue_print_jobs {
	
	
	public static void main(String[]args) {


	Queue<JobOrder> queue = new LinkedList<>();	
	
	queue.offer(new JobOrder(20, "assingment"));
	queue.offer(new JobOrder(30, "Gym"));
	queue.offer(new JobOrder(50, "resume"));
	
	
	
	while(!queue.isEmpty()) {
		System.out.println( queue.poll());
		
	}

}
}

class JobOrder{
	int jobId;
	String jobName;
	public JobOrder(int jobId, String jobName) {
		super();
		this.jobId = jobId;
		this.jobName = jobName;
	}
	
	public int  getJobId() {
		return jobId;
	}
	
	public void setjobId( int jobId) {
		
		this.jobId = jobId;
		
	}
	
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	 @Override
	    public String toString() {
	        return "JobOrder [jobId=" + jobId + ", jobName=" + jobName + "]";
	    }
	}
	

