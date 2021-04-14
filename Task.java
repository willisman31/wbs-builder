/**
 * Create Task to complete.
 * 
 * @author Willis 
 * @version 4.12.2021
 */
public class Task {

	private Status status;
	private String taskName, description;
	private int taskNum;
	private String[] dependency;
	private double duration;

	/**
	 * Default constructor
	 */
	Task() {
		this.status = Status.OPEN;
		this.taskName = null;
		this.taskNum = -1;
		this.dependency = null;
		this.duration = -1;
	}

	/**
	 * Parameterized constructor; four arg.
	 * 
	 * @param taskName
	 * @param taskNum
	 * @param dependency
	 * @param duration
	 */
	Task(String taskName, int taskNum, String[] dependency, double duration) {
		this.status = Status.OPEN;
		this.taskName = taskName;
		this.taskNum = taskNum;
		this.dependency = dependency;
		this.duration = duration;
		this.description = taskName;
	}

	/**
	 * Parameterized constructor; five arg.
	 * 
	 * @param taskName Name of task.
	 * @param taskNum task number.
	 * @param dependency list of dependencies.
	 * @param duration task duration.
	 * @param description task description.
	 */
	Task(String taskName, int taskNum, String[] dependency, double duration, String description) {
		this(taskName, taskNum, dependency, duration);
		this.description = description;
	}

	/**
	 * Copy constructor.
	 * 
	 * @param task to be copied.
	 */
	Task(Task task) {
		this.taskName = task.getTaskName();
		this.taskNum = task.copyTaskNum();
		this.status = task.getStatus();
		this.dependency = task.copyDependency();
		this.description = task.getDescription();
		this.duration = task.getDuration();
	}

	/**
	 * TaskName getter.
	 * 
	 * @return taskName.
	 */
	String getTaskName() {
		return this.taskName;
	}

	/**
	 * Name setter.
	 * 
	 * @param name new task name.
	 */
	void setName(String name) {
		this.taskName = name;
	}

	/**
	 * Duration getter.
	 * 
	 * @return duration in days.
	 */
	double getDuration() {
		return this.duration;
	}

	/**
	 * TaskNum getter
	 * 
	 * @return taskNum as int.
	 */
	int getTaskNum() {
		return this.taskNum;
	}

	/**
	 * Set task number.
	 * 
	 * @param num next task number.
	 */
	void setNum(int num) {
		this.taskNum = num;
	}

	/**
	 * Status getter.
	 * 
	 * @return status String.
	 */
	Status getStatus() {
		return this.status;
	}

	void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * Task number copier.
	 * 
	 * @return task number.
	 */
	int copyTaskNum() {
		return this.taskNum;
	}

	/**
	 * Dependency getter.
	 * 
	 * @return dependencies as a String.
	 */
	String getDependency() {
		String temp = "";
		for (int i = 0; i < this.dependency.length; i++) {
			temp += dependency[i];
			if (i != dependency.length - 1)
				temp += ", ";
		}
		return temp;
	}

	/**
	 * Dependency getter for copy constructor.
	 * 
	 * @return dependency of this.
	 */
	String[] copyDependency() {
		return this.dependency;
	}

	/**
	 * Description getter.
	 * 
	 * @return task description.
	 */
	String getDescription() {
		return this.description;
	}

	/**
	 * Description setter.
	 * 
	 * @param d new description.
	 */
	void setDescription(String d) {
		this.description = d;
	}

	/**
	 * Print info about Task.
	 * 
	 * @return task info as single line string.
	 */
	String outString() {
		String temp = this.taskNum + " ";
		temp += this.taskName + " ";
		temp += this.getDependency() + " ";
		temp += this.getDuration() + " ";
		temp += this.getStatus().toString() + " ";
		temp += this.getDescription();
		return temp;
	}
	
	/**
	 * Checks if task conforms to requirements of real task.
	 * 
	 * @return whether task conforms.
	 */
	boolean goodTask() {
		boolean good = !taskName.equals(null);
		good = good && taskNum > -1;
		good = good && duration > 0;
		return good;
	}

}
