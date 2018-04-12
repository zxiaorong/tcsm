package test;

import java.util.List;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tcsm.dao.material.MaterialMapper;
import cn.tcsm.dao.supplier.SupplierMapper;
import cn.tcsm.dao.user.UserMapper;
import cn.tcsm.pojo.Material;
import cn.tcsm.pojo.Supplier;
import cn.tcsm.pojo.User;

public class MatTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AbstractXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-applicationContext.xml");
//	MaterialMapper materialMapper=applicationContext.getBean(MaterialMapper.class);
//	Material material=new Material();
//	material.setGradeId(1);
//	material.setMatName("ÉÏÄû¶þ");
//	material.setMatSymbol("SXT");
//	material.setMatSprice(22.50);
////	int ret=materialMapper.insert(material);
////	System.out.println(ret);
////	System.out.println(materialMapper.deleteById(1));
//	material.setId(2);
////	System.out.println(materialMapper.updataById(material));
//	List<Material> mat=materialMapper.getList(material);
//	for(Material mate:mat){
//		System.out.println(mate);
//	}
	User user=new User();
	user.setId("p101");
	user.setPwd("1010");
	UserMapper userMapper=applicationContext.getBean(UserMapper.class);
	List<User> u=userMapper.login(user);
	System.out.println(u);
	for(User us:u){
		System.out.println(us);
	}
	}

}
