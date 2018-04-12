package cn.tcsm.pojo;

import java.sql.Timestamp;


public class User {
	private String id;
	private String pwd;
	private Integer roleId;
	private Integer isdDelete;
	private Integer areaId;
	private String insertUser;
	private String updateUser;
	private Timestamp insertTime;
	private Timestamp updateTime;
	public String getInsertUser() {
		return insertUser;
	}
	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public Timestamp getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(Timestamp insertTime) {
		this.insertTime = insertTime;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer getIsdDelete() {
		return isdDelete;
	}
	public void setIsdDelete(Integer isdDelete) {
		this.isdDelete = isdDelete;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", pwd=" + pwd + ", roleId=" + roleId + ", isdDelete=" + isdDelete + ", areaId="
				+ areaId + "]";
	}
	

}
