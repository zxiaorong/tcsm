package cn.tcsm.dao.supplier;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.tcsm.pojo.Supplier;

public interface SupplierMapper {
	/**
	 * 
	 * @param supplier ��Ӧ��ʵ��
	 * @return Ӱ������
	 */
	public int insert(Supplier supplier);
	/**
	 * 
	 * @param id ��Ӧ�� ID
	 * @return Ӱ������
	 */
	public int deleteById(@Param("id") Integer id);
	/**
	 * 
	 * @param supplier ��Ӧ��ʵ��
	 * @return Ӱ������
	 */
	public int updataById(@Param("Supplier")Supplier supplier);
	/**
	 * 
	 * @param supplier ��Ӧ��ʵ��
	 * @return ������Ӧ����Ϣ��list����
	 */
	public List<Supplier> getList(@Param("Supplier")Supplier supplier);
}
