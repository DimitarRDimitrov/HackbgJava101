package friday.todo;

public interface ToDoInterface {
	
	void add(Task t);
	void markFinished(Task t);
	void markCancelled(Task t);
	Task getTop();
	boolean canFinish();
	double getRemainingTime();

}
