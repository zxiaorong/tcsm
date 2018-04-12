package cn.tcsm.dao.material;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tcsm.pojo.Material;

public interface MaterialMapper {
	/**
	 * 
	 * @param Material ԭ����ʵ��
	 * @return Ӱ������
	 */
	public int insert(@Param("material")Material material);
	/**
	 * 
	 * @param id ԭ���� ID
	 * @return Ӱ������
	 */
	public int deleteById(@Param("id") Integer id);
	/**
	 * 
	 * @param Material ԭ����ʵ��
	 * @return Ӱ������
	 */
	public int updataById(Material material);
	/**
	 * 
	 * @param Material ԭ����ʵ��
	 * @return ԭ������Ϣ
	 */
	public List<Material> getList(Material material);
}
