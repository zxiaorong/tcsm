package cn.tcsm.dao.grade;

import java.util.List;

import cn.tcsm.pojo.Grade;

public interface GradeMapper {
	/**
	 * 
	 * @param grade �ȼ�ʵ��
	 * @return ���еȼ���Ϣ��List����
	 */
	public List<Grade> getGrade(Grade grade);
}
