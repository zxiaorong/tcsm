package cn.tcsm.pojo;

import java.sql.Timestamp;

public class Material {
	private Integer id;
	private String matSymbol;
	private String matName;
	private double matSprice;
	private Integer gradeId;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMatSymbol() {
		return matSymbol;
	}
	public void setMatSymbol(String matSymbol) {
		this.matSymbol = matSymbol;
	}
	public String getMatName() {
		return matName;
	}
	public void setMatName(String matName) {
		this.matName = matName;
	}
	public double getMatSprice() {
		return matSprice;
	}
	public void setMatSprice(double matSprice) {
		this.matSprice = matSprice;
	}
	public Integer getGradeId() {
		return gradeId;
	}
	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	@Override
	public String toString() {
		return "Material [id=" + id + ", matSymbol=" + matSymbol + ", matName=" + matName + ", matSprice=" + matSprice
				+ ", gradeId=" + gradeId + ", isDelete=" + isDelete + "]";
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	
}
