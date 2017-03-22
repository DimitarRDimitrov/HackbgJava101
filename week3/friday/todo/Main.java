package friday.todo;

public class Main {

	public static void main(String[] args) {

		ToDoList todo = new ToDoList(11);
		todo.add(new Task("Study for algebra", 10, 3.5));
		todo.add(new Task("Geometry", 5, 2));
		todo.add(new Task("Maths", 3, 2));
		todo.add(new Task("Gym", 10, 1));
		
		if (todo.canFinish()){
		    System.out.println("Woohoo!");
		} else {
		    System.out.println("I am ...screwed :(");
		}
		
		
		System.out.println(todo.getTop()); //StudyForAlgebraTask
		System.out.println(todo.getRemainingTime());
		Task algebra = todo.getTaskWithName("gym");
		todo.markFinished(algebra);
		System.out.println(todo.getTop());
	}

}
