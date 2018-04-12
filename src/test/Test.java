package test;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tcsm.dao.area.AreaMapper;
import cn.tcsm.dao.grade.GradeMapper;
import cn.tcsm.dao.indent.IndentMapper;
import cn.tcsm.dao.indentmaterial.IndentMaterialMapper;
import cn.tcsm.dao.inform.InformMapper;
import cn.tcsm.dao.material.MaterialMapper;
import cn.tcsm.dao.role.RoleMapper;
import cn.tcsm.dao.supplier.SupplierMapper;
import cn.tcsm.pojo.Area;
import cn.tcsm.pojo.Grade;
import cn.tcsm.pojo.Indent;
import cn.tcsm.pojo.IndentMaterial;
import cn.tcsm.pojo.Inform;
import cn.tcsm.pojo.Material;
import cn.tcsm.pojo.Role;
import cn.tcsm.pojo.Supplier;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AbstractXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-applicationContext.xml");
        SupplierMapper SupplierMapper = applicationContext.getBean(SupplierMapper.class);
//         Supplier supplier=new Supplier();
//         supplier.setSupName("张继");
//         supplier.setAddr("大有乡侯家屯");
//         supplier.setPhone("18234234236");
//         supplier.setRoleId(2);
//         supplier.setCardId("823984893480912");
//         supplier.setCultivatedArea(90);
//         supplier.setPwd("1515");
//         int ret=SupplierMapper.insert(supplier);
//         System.out.println(ret);
//         int res=SupplierMapper.deleteById(2);
//         System.out.println(res);
//         	supplier.setId(3);
////         	supplier.setTaskNum(20000);
//         	supplier.setSupName("易连恺");
////         	supplier.setApprove(1);
//         	 int ret=SupplierMapper.updataById(supplier);
//         	 System.out.println(ret);
//         List<Supplier> sup=SupplierMapper.getList(supplier);
//         for(Supplier suplier:sup){
//        	 System.out.println(suplier.getCardId()+","+suplier.getSupName()+","+suplier.getPhone());
//         }
//         RoleMapper roleMapper=applicationContext.getBean(RoleMapper.class);
//         Role role=new Role();
//         role.setId(1);
//         List<Role> r=roleMapper.getRole(role);
//         for(Role ro:r){
//        	 System.out.println(ro.getRoleName());
//         }
        InformMapper informMapper=applicationContext.getBean(InformMapper.class);
        Inform inform=new Inform();
//        inform.setId(2);
////        inform.setAuthor("p101");
////        inform.setInfTitle("通知标题2");
////        inform.setInfDetail("通知详情1");
////        int ret=informMapper.insert(inform);
////        System.out.println(ret);
////        int res=informMapper.updateById(inform);
////        System.out.println(res);
//        List<Inform> i=informMapper.getInform(inform);
//        for(Inform in:i){
//        	System.out.println(in.getInfTitle()+","+in.getAuthor()+","+in.getInsertTime()+"updateTime:"+in.getUpdateTime());
//        }
//       
//       
	        IndentMapper indentMapper=applicationContext.getBean(IndentMapper.class);
	        Indent indent=new Indent();
//	        indent.setInsertUser("m101");
//        indent.setSupId("s101");
//        int ret=indentMapper.insert(indent);
//        System.out.println(ret);
//	        List<Indent> ind=indentMapper.getIndent(indent);
//	        for(Indent i:ind){
//	        	System.out.println(i.getInsertTime());
//	        }
	        
	        IndentMaterialMapper indentMaterialMapper=applicationContext.getBean(IndentMaterialMapper.class);
	        IndentMaterial indentmaterial=new IndentMaterial();
//	        indentmaterial.setIndentId(1);
//	        indentmaterial.setMatId(1);
//	        indentmaterial.setMatNum(200);
//	        indentmaterial.setInsertUser("s101");
//	        int ret=indentMaterialMapper.insert(indentmaterial);
//	        System.out.println(ret);
//	        indentmaterial.setId(2);
	       List<IndentMaterial> im=indentMaterialMapper.getIndentMaterial(indentmaterial);
	       for(IndentMaterial in:im){
	    	   System.out.println(in);
	       }
//	        indentmaterial.setIndentId(2);
//	        indentmaterial.setUpdateUser("s102");
//	        int res=indentMaterialMapper.updateById(indentmaterial);
//	       System.out.println(indentMaterialMapper.deleteById(1));
	}

}
