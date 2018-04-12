package cn.tcsm.dao.indent;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tcsm.pojo.Indent;

public interface IndentMapper {
	/**
	 * 
	 * @param indent ����ʵ��
	 * @return Ӱ������
	 */
	public int insert(Indent indent);
	/**
	 * 
	 * @param id ����ID
	 * @return Ӱ������
	 */
	public int deleteById(@Param("id")Integer id);
	/**
	 * 
	 * @param indent ����ʵ��
	 * @return Ӱ������
	 */
	public int updateById(Indent indent);	
	/**
	 * 
	 * @param indent ����ʵ��
	 * @return ����������Ϣ��List����
	 */
	public List<Indent> getIndent(Indent indent);
	
}
