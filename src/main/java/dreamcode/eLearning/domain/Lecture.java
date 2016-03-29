package dreamcode.eLearning.domain;

import java.io.Serializable;
import java.util.List;


/**
 * @author 09162 김범종
 * Lecture 도메인 입니다.
 */
public class Lecture implements Serializable{

	private static final long serialVersionUID = -7491079664669452100L;
	
	private Integer id;
	private String category;
	private String lectureName;
	private String description;
	private String lectureVideoUrl;
	private String instructor;
	private String iconImg;
	private String qrcodeImg;
	private String previewImg;
	private String publishFile;
	private String resourceFile;
	private List<LectureDetail> lectureDetails;
	private List<Comment> comments;
	
	public void addLectureDetail(LectureDetail lectureDetail){
		lectureDetails.add(lectureDetail);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLectureName() {
		return lectureName;
	}
	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLectureVideoUrl() {
		return lectureVideoUrl;
	}
	public void setLectureVideoUrl(String lectureVideoUrl) {
		this.lectureVideoUrl = lectureVideoUrl;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public String getIconImg() {
		return iconImg;
	}
	public void setIconImg(String iconImg) {
		this.iconImg = iconImg;
	}
	public String getQrcodeImg() {
		return qrcodeImg;
	}
	public void setQrcodeImg(String qrcodeImg) {
		this.qrcodeImg = qrcodeImg;
	}
	public String getPreviewImg() {
		return previewImg;
	}
	public void setPreviewImg(String previewImg) {
		this.previewImg = previewImg;
	}
	public String getPublishFile() {
		return publishFile;
	}
	public void setPublishFile(String publishFile) {
		this.publishFile = publishFile;
	}
	public String getResourceFile() {
		return resourceFile;
	}
	public void setResourceFile(String resourceFile) {
		this.resourceFile = resourceFile;
	}
	public List<LectureDetail> getLectureDetails() {
		return lectureDetails;
	}
	public void setLectureDetails(List<LectureDetail> lectureDetails) {
		this.lectureDetails = lectureDetails;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	
}
