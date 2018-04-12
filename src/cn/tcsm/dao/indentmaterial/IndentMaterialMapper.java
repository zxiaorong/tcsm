package cn.tcsm.dao.indentmaterial;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tcsm.pojo.IndentMaterial;

public interface IndentMaterialMapper {
	public int insert(IndentMaterial indentmaterial);
	public int deleteById(@Param("id")Integer id);
	public int updateById(IndentMaterial indentmaterial);
	public List<IndentMaterial> getIndentMaterial(IndentMaterial indentmaterial);
}
