package cn.tcsm.dao.area;

import java.util.List;

import cn.tcsm.pojo.Area;

public interface AreaMapper {
	/**
	 * 
	 * @param area Ƭ��ʵ��
	 * @return ����Ƭ����Ϣ��List����
	 */
	public List<Area> getArea(Area area);
}
