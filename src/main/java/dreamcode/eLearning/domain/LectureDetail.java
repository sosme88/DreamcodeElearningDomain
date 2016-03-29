package dreamcode.eLearning.domain;

import java.io.Serializable;


/**
 * @author 09162 김범종
 * LectureDetail 도메인 입니다.
 * LectureDetail은 강의에 필요한 교재와 같습니다.
 * LectureDetail은 이미지 파일 형태입니다.
 */
public class LectureDetail implements Serializable{

	private static final long serialVersionUID = -463531876411758240L;

	private Integer id;
	private Integer lectureId;
	private String content;
	private String detailOrder;
	
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
	public String getDetailOrder() {
		return detailOrder;
	}
	public void setDetailOrder(String detailOrder) {
		this.detailOrder = detailOrder;
	}
}
