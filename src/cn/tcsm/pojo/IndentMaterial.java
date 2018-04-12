package cn.tcsm.pojo;

import java.sql.Timestamp;

public class IndentMaterial {
	private Integer id;
	private Integer indentId;
	private Integer matId;
	private double matNum;
	private Integer isdDelete;
	private String insertUser;
	private String updateUser;
	private Timestamp insertTime;
	private Timestamp updateTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIndentId() {
		return indentId;
	}
	public void setIndentId(Integer indentId) {
		this.indentId = indentId;
	}
	public Integer getMatId() {
		return matId;
	}
	public void setMatId(Integer matId) {
		this.matId = matId;
	}
	public double getMatNum() {
		return matNum;
	}
	public void setMatNum(double matNum) {
		this.matNum = matNum;
	}
	public Integer getIsdDelete() {
		return isdDelete;
	}
	public void setIsdDelete(Integer isdDelete) {
		this.isdDelete = isdDelete;
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
	public void setInsertTime(Timestamp insertTime) {
		this.insertTime = insertTime;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "IndentMaterial [id=" + id + ", indentId=" + indentId + ", matId=" + matId + ", matNum=" + matNum
				+ ", isdDelete=" + isdDelete + ", insertUser=" + insertUser + ", updateUser=" + updateUser
				+ ", insertTime=" + insertTime + ", updateTime=" + updateTime + "]";
	}
	
}
