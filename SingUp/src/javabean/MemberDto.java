package javabean;

public class MemberDto {
	private String userid;
	private String usernm;
	private String password;
	private String jumin1;
	private String jumin2;
	private String mailrcv;
	private String gender;
	private String job;
	private String intro;
	
	public MemberDto() {
		
	}
	
	public MemberDto(String userid, String usernm, String password,
			String jumin1, String jumin2, String mailrcv, String gender, String job, String intro) {
		this.userid = userid;
		this.usernm = usernm;
		this.password = password;
	
		this.jumin1 = jumin1;
		this.jumin2 = jumin2;
		this.mailrcv=mailrcv;
		this.gender = gender;
		this.job = job;
		this.intro = intro;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsernm() {
		return usernm;
	}

	public void setUsernm(String usernm) {
		this.usernm = usernm;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getJumin1() {
		return jumin1;
	}

	public void setJumin1(String jumin1) {
		this.jumin1 = jumin1;
	}

	public String getJumin2() {
		return jumin2;
	}

	public void setJumin2(String jumin2) {
		this.jumin2 = jumin2;
	}

	public String getMailrcv() {
		return mailrcv;
	}

	public void setMailrcv(String mailrcv) {
		this.mailrcv = mailrcv;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}
	
}
