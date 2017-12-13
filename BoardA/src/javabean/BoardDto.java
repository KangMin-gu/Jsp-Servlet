package javabean;

public class BoardDto {
	private String number;
	private String cname;
	private String ctitle;
	private String ccontents;
	private String datee;
	private String views;

public BoardDto() {
	
}

public BoardDto(String number, String cname, String ctitle, String ccontents,
		String datee, String views) {
	this.number=number;
	this.cname=cname;
	this.ctitle=ctitle;
	this.ccontents=ccontents;
	this.datee=datee;
	this.views=views;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public String getCtitle() {
	return ctitle;
}

public void setCtitle(String ctitle) {
	this.ctitle = ctitle;
}

public String getCcontents() {
	return ccontents;
}

public void setCcontents(String ccontents) {
	this.ccontents = ccontents;
}

public String getDatee() {
	return datee;
}

public void setDatee(String datee) {
	this.datee = datee;
}

public String getViews() {
	return views;
}

public void setViews(String views) {
	this.views = views;
}



}
