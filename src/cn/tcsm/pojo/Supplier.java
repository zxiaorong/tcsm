package cn.tcsm.pojo;

import java.sql.Timestamp;

public class Supplier {
	private String id;
	private String pwd;
	private String supName;
	private Integer roleId;
	private Integer areaId;
	private String phone;
	private String addr;
	private double cultivatedArea;
	private String cardId;
	private Integer approve;
	private double taskNum;
	private String compactId;
	private Integer isDelete;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getSupName() {
		return supName;
	}
	public void setSupName(String supName) {
		this.supName = supName;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public double getCultivatedArea() {
		return cultivatedArea;
	}
	public void setCultivatedArea(double cultivatedArea) {
		this.cultivatedArea = cultivatedArea;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public Integer getApprove() {
		return approve;
	}
	public void setApprove(Integer approve) {
		this.approve = approve;
	}
	public double getTaskNum() {
		return taskNum;
	}
	public void setTaskNum(double taskNum) {
		this.taskNum = taskNum;
	}
	public String getCompactId() {
		return compactId;
	}
	public void setCompactId(String compactId) {
		this.compactId = compactId;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
}
