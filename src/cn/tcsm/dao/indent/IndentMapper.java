package cn.tcsm.dao.indent;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tcsm.pojo.Indent;

public interface IndentMapper {
	/**
	 * 
	 * @param indent 订单实体
	 * @return 影响行数
	 */
	public int insert(Indent indent);
	/**
	 * 
	 * @param id 订单ID
	 * @return 影响行数
	 */
	public int deleteById(@Param("id")Integer id);
	/**
	 * 
	 * @param indent 订单实体
	 * @return 影响行数
	 */
	public int updateById(Indent indent);	
	/**
	 * 
	 * @param indent 订单实体
	 * @return 包含订单信息的List集合
	 */
	public List<Indent> getIndent(Indent indent);
	
}
