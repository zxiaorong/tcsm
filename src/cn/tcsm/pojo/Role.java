package cn.tcsm.pojo;

import java.sql.Timestamp;

public class Role {
	private Integer id;
	private String roleName;
	private Integer areaId;
	private Integer isDelete;
	private String insertUser;
	private String updateUser;
	private Timestamp insertTime;
	private Timestamp updateTime;
	public void setInsertTime(Timestamp insertTime) {
		this.insertTime = insertTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getId() {
		return id;
	}
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
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
}
