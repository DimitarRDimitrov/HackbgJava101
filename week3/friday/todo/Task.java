package friday.todo;

public class Task {
	
	private final String name;
	private int priority;
	private double hoursToFinish;

	private status status;
	
	
	public Task(String name, int priority, double hoursToFinish) {
		this.name = name;
		this.priority = priority;
		this.hoursToFinish = hoursToFinish;
		status = friday.todo.status.TODO;
	}


	public int getPriority() {
		return priority;
	}


	public void setPriority(int priority) {
		this.priority = priority;
	}

	

	public status getStatus() {
		return status;
	}


	public void setStatus(status status) {
		this.status = status;
	}


	public double getHoursToFinish() {
		return hoursToFinish;
	}


	public void setHoursToFinish(double hoursToFinish) {
		this.hoursToFinish = hoursToFinish;
	}


	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + ", hoursToFinish=" + hoursToFinish + "]";
	}


	

}
