package cn.tcsm.dao.role;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tcsm.pojo.Role;

public interface RoleMapper {
	public List<Role> getRole(Role role);
}
