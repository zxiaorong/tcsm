package cn.tcsm.dao.material;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tcsm.pojo.Material;

public interface MaterialMapper {
	/**
	 * 
	 * @param Material 原材料实体
	 * @return 影响行数
	 */
	public int insert(@Param("material")Material material);
	/**
	 * 
	 * @param id 原材料 ID
	 * @return 影响行数
	 */
	public int deleteById(@Param("id") Integer id);
	/**
	 * 
	 * @param Material 原材料实体
	 * @return 影响行数
	 */
	public int updataById(Material material);
	/**
	 * 
	 * @param Material 原材料实体
	 * @return 原材料信息
	 */
	public List<Material> getList(Material material);
}
