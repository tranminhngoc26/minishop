package sonat.minhngoc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sonat.minhngoc.entity.GiamDoc;
import sonat.minhngoc.entity.NhanVien;

@Controller
public class TrangChuController {
   @RequestMapping("/")
   @ResponseBody
  public String TrangChu(){
     ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
     NhanVien nhanVien = (NhanVien) context.getBean("nhanvien");
     for(GiamDoc value : nhanVien.getList()){
       System.out.println(value.getTennhanvien());
     }
//     nhanVien.getThongBao();
//     NhanVien nv = NhanVien.createNhanVien();
//     NhanVien nv1 = NhanVien.createNhanVien();
//     NhanVien nv2 = NhanVien.createNhanVien();
     ((ClassPathXmlApplicationContext)context).close();
     return  "abc";
   }
}
