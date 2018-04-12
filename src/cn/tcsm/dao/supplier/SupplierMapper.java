package cn.tcsm.dao.supplier;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.tcsm.pojo.Supplier;

public interface SupplierMapper {
	/**
	 * 
	 * @param supplier 供应商实体
	 * @return 影响行数
	 */
	public int insert(Supplier supplier);
	/**
	 * 
	 * @param id 供应商 ID
	 * @return 影响行数
	 */
	public int deleteById(@Param("id") Integer id);
	/**
	 * 
	 * @param supplier 供应商实体
	 * @return 影响行数
	 */
	public int updataById(@Param("Supplier")Supplier supplier);
	/**
	 * 
	 * @param supplier 供应商实体
	 * @return 包含供应商信息的list集合
	 */
	public List<Supplier> getList(@Param("Supplier")Supplier supplier);
}
