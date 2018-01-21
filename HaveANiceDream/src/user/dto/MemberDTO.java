package user.dto;

import java.sql.Date;

public class MemberDTO {

    private String userId;

    private String userPw;

    private String userEmail;

    private String userName;

    private String userZipcode;

    private String userAddr;

    private String userTel;

    private Date userSigdate;

    private String userLogType;

    private Date userLastLoginTime;

    private Integer pointTotal;

    private String userType;
    
    public MemberDTO() {
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(String userId, String userPw, String userEmail, String userName, String userZipcode,
			String userAddr, String userTel) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userEmail = userEmail;
		this.userName = userName;
		this.userZipcode = userZipcode;
		this.userAddr = userAddr;
		this.userTel = userTel;
		this.userSigdate = null;
		this.userLogType = "기본";
		this.userLastLoginTime = null;
		this.pointTotal = 5000;
		this.userType = "일반회원";
	}

	public MemberDTO(String userId, String userPw, String userEmail, String userName, String userZipcode,
			String userAddr, String userTel, Date userSigdate, String userLogType, Date userLastLoginTime,
			Integer pointTotal, String userType) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userEmail = userEmail;
		this.userName = userName;
		this.userZipcode = userZipcode;
		this.userAddr = userAddr;
		this.userTel = userTel;
		this.userSigdate = userSigdate;
		this.userLogType = userLogType;
		this.userLastLoginTime = userLastLoginTime;
		this.pointTotal = pointTotal;
		this.userType = userType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserZipcode() {
		return userZipcode;
	}

	public void setUserZipcode(String userZipcode) {
		this.userZipcode = userZipcode;
	}

	public String getUserAddr() {
		return userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public Date getUserSigdate() {
		return userSigdate;
	}

	public void setUserSigdate(Date userSigdate) {
		this.userSigdate = userSigdate;
	}

	public String getUserLogType() {
		return userLogType;
	}

	public void setUserLogType(String userLogType) {
		this.userLogType = userLogType;
	}

	public Date getUserLastLoginTime() {
		return userLastLoginTime;
	}

	public void setUserLastLoginTime(Date userLastLoginTime) {
		this.userLastLoginTime = userLastLoginTime;
	}

	public Integer getPointTotal() {
		return pointTotal;
	}

	public void setPointTotal(Integer pointTotal) {
		this.pointTotal = pointTotal;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "MemberDTO [userId=" + userId + ", userPw=" + userPw + ", userEmail=" + userEmail + ", userName="
				+ userName + ", userZipcode=" + userZipcode + ", userAddr=" + userAddr + ", userTel=" + userTel
				+ ", userSigdate=" + userSigdate + ", userLogType=" + userLogType + ", userLastLoginTime="
				+ userLastLoginTime + ", pointTotal=" + pointTotal + ", userType=" + userType + "]";
	}
    
	
}