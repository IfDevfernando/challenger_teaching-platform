package challenger_teaching.entities;

public abstract class Lesson {

	private String title;
	
	
	private Video video;
	private Task task;
	
	

	public Lesson(String title) {
		
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public  int duration() {
		
		return video.duration() + task.duration();
	}
	
	
	
}
