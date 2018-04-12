package cn.tcsm.dao.inform;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tcsm.pojo.Inform;

public interface InformMapper {
	/**
	 * 
	 * @param inform ֪ͨʵ��
	 * @return Ӱ������
	 */
	public int insert(@Param("Inform")Inform inform);
	/**
	 * 
	 * @param id ֪ͨID
	 * @return Ӱ������
	 */
	public int deleteById(@Param("id")Integer id);
	/**
	 * 
	 * @param inform ֪ͨʵ��
	 * @return Ӱ������
	 */
	public int updateById(Inform inform);
	/**
	 * 
	 * @param inform ֪ͨʵ��
	 * @return ����֪ͨ��Ϣ��List����
	 */
	public List<Inform> getInform(Inform inform);
}
