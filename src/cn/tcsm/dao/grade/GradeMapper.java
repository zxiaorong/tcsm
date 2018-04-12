package cn.tcsm.dao.grade;

import java.util.List;

import cn.tcsm.pojo.Grade;

public interface GradeMapper {
	/**
	 * 
	 * @param grade 等级实体
	 * @return 含有等级信息的List集合
	 */
	public List<Grade> getGrade(Grade grade);
}
