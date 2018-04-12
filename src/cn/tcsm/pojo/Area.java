package cn.tcsm.pojo;


import com.sun.jmx.snmp.Timestamp;

public class Area {
	@Override
	public String toString() {
		return "Area [id=" + id + ", areaName=" + areaName + ", isdDelete=" + isdDelete + ", insertUser=" + insertUser
				+ ", updateUser=" + updateUser + ", insertTime=" + insertTime + ", updateTime=" + updateTime + "]";
	}
	private Integer id;
	private String areaName;
	private Integer isdDelete;
	private String insertUser;
	private String updateUser;
	private Timestamp insertTime;
	private Timestamp updateTime;
	
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public Integer getIsdDelete() {
		return isdDelete;
	}
	public void setIsdDelete(Integer isdDelete) {
		this.isdDelete = isdDelete;
	}
}
