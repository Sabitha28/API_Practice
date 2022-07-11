package pojoSerializarion;

public class CreateSerialization {
	
	private String userId;
	private String id;
	private String title;
	private String body;
	
	public String getUserId() {
		return userId;
	}
	public String setUserId(String userId) {
		return this.userId = userId;
	}
	public String getId() {
		return id;
	}
	public String setId(String id) {
		return this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public String setTitle(String title) {
		return this.title = title;
	}
	public String getBody() {
		return body;
	}
	public String setBody(String body) {
		return this.body = body;
	}
	@Override
	public String toString() {
		return "CreateSerialization [userId=" + userId + ", id=" + id + ", title=" + title + ", body=" + body + "]";
	}
	
	
}
