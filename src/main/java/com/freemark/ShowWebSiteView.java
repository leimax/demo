package com.freemark;

public class ShowWebSiteView 
{
	private String webSite;  
    private String userName;  
    private String password;
    private String email;
    private String remark1;
    private String remark2;
    private String remark3;
    private String webName;
    public String getWebName() {
		return webName;
	}
	public void setWebName(String webName) {
		this.webName = webName;
	}
	
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRemark1() {
		return remark1;
	}
	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}
	public String getRemark2() {
		return remark2;
	}
	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}
	public String getRemark3() {
		return remark3;
	}
	public void setRemark3(String remark3) {
		this.remark3 = remark3;
	}
	public ShowWebSiteView(String webSite, String userName, String password,
			String email, String remark1, String remark2, String remark3,String webName) {
		super();
		this.webSite = webSite;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.remark1 = remark1;
		this.remark2 = remark2;
		this.remark3 = remark3;
		this.webName = webName ;
	}
      

}
