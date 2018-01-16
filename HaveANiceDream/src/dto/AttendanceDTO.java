package dto;

import java.sql.Date;

public class AttendanceDTO {

    private Integer attNo;

    private String userId;

    private Integer attPoint;

    private Date attDate;
    
    public AttendanceDTO() {
		// TODO Auto-generated constructor stub
	}

	public AttendanceDTO(Integer attNo, String userId, Integer attPoint, Date attDate) {
		super();
		this.attNo = attNo;
		this.userId = userId;
		this.attPoint = attPoint;
		this.attDate = attDate;
	}

	public Integer getAttNo() {
		return attNo;
	}

	public void setAttNo(Integer attNo) {
		this.attNo = attNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getAttPoint() {
		return attPoint;
	}

	public void setAttPoint(Integer attPoint) {
		this.attPoint = attPoint;
	}

	public Date getAttDate() {
		return attDate;
	}

	public void setAttDate(Date attDate) {
		this.attDate = attDate;
	}

	@Override
	public String toString() {
		return "AttendanceDTO [attNo=" + attNo + ", userId=" + userId + ", attPoint=" + attPoint + ", attDate="
				+ attDate + "]";
	}
    
}