package dreamcode.eLearning.domain;

import java.io.Serializable;


/**
 * @author 김범종
 * comment 도메인 입니다.
 */
public class Comment implements Serializable{

	private static final long serialVersionUID = -3705373627348721956L;

	private Integer id;
	private Integer lectureId;
	private String content;
	private String userId;
	private String userNickname;
	private String createdDate;
	private String profileImg;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getLectureId() {
		return lectureId;
	}
	public void setLectureId(Integer lectureId) {
		this.lectureId = lectureId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getProfileImg() {
		return profileImg;
	}
	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}
	
}
