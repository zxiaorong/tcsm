package cn.tcsm.dao.area;

import java.util.List;

import cn.tcsm.pojo.Area;

public interface AreaMapper {
	/**
	 * 
	 * @param area 片区实体
	 * @return 包含片区信息的List集合
	 */
	public List<Area> getArea(Area area);
}
