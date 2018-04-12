package cn.tcsm.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tcsm.pojo.User;

public interface UserMapper {
	public List<User> login(User user);
}
