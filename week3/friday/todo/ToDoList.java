package friday.todo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ToDoList implements ToDoInterface{
	
	private double time;
	
	
	public ToDoList(double time) {
		super();
		this.time = time;
	}

	PriorityQueue<Task> taskList = new PriorityQueue<>(new Comparator<Task>()  {

		@Override
		public int compare(Task o1, Task o2) {

			if(o1.getPriority() == o2.getPriority()) {
				return (int) (o1.getHoursToFinish() - o2.getHoursToFinish());
			} else {
				return o2.getPriority() - o1.getPriority();
			}
			
		}
	});

	@Override
	public void add(Task t) {
		if (t.getStatus() != status.FINISHED){
			taskList.add(t);
		}
	}
	
	public Task getTaskWithName(String name) {
		for(Task t: taskList) {
			if(t.getName().equalsIgnoreCase(name)){
				return t;
			}
		}
		return null;
	}

	public void markFinished(Task t) {
		if (taskList.contains(t)) {
			t.setStatus(status.FINISHED);
			taskList.poll();
		}
	}

	public void markCancelled(Task t) {
		if(taskList.contains(t)) {
			t.setStatus(status.CANCELLED);
			taskList.remove(t);
		}
		
	}

	@Override
	public Task getTop() {
		return taskList.peek();
	}

	@Override
	public boolean canFinish() {
		double hoursNeeded = getRemainingTime();
		return this.time > hoursNeeded;
	
	}

	@Override
	public double getRemainingTime() {
		double timeNeeded = 0;
		for(Task t: taskList) {
			timeNeeded += t.getHoursToFinish();
		}
		return timeNeeded;
		
	}
	
	

}
