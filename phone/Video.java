package Day7;

public class Video {
	private String no;
	private String title;
	private String actor;
	
	public Video() {}

	public Video(String no, String title, String actor) {
		super();
		this.no = no;
		this.title = title;
		this.actor = actor;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
	
	
}
