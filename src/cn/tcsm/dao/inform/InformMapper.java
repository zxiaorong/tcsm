package cn.tcsm.dao.inform;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tcsm.pojo.Inform;

public interface InformMapper {
	/**
	 * 
	 * @param inform 通知实体
	 * @return 影响行数
	 */
	public int insert(@Param("Inform")Inform inform);
	/**
	 * 
	 * @param id 通知ID
	 * @return 影响行数
	 */
	public int deleteById(@Param("id")Integer id);
	/**
	 * 
	 * @param inform 通知实体
	 * @return 影响行数
	 */
	public int updateById(Inform inform);
	/**
	 * 
	 * @param inform 通知实体
	 * @return 包含通知信息的List集合
	 */
	public List<Inform> getInform(Inform inform);
}
