package com.ibeifeng.dubbo.consumer.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ibeifeng.dubbo.consumer.service.IUserService;
import com.ibeifeng.dubbo.service.IPersonService;

@Controller
@RequestMapping(value="/user")
public class UserController {
    
    @Reference
    IPersonService personService;
    
    @Autowired
    IUserService userService;
    
    @RequestMapping("/dubbo")
    public String userList() {
        System.out.println(personService.sayHello("lucy"));
        System.out.println(personService.findUserById(0));
        return "demo/users";
    }
    
    
    @RequestMapping("/list")
    public String selectAllUser(HttpServletRequest request,Model model) {
        return "demo/user_list_easyui";
    }
    
    @ResponseBody
    @RequestMapping("/datajson")
    public Map<String, Object> loadDataJson(HttpServletRequest request) {
        Map<String, Object> result=new HashMap<String, Object>();
        String currentPage=request.getParameter("page");
        String pageSize=request.getParameter("rows"); 
        Map<String, Object> params=new HashMap<String, Object>();
        
        Long total= userService.seletCountAllUsers();
        result.put("total", total);
        //PageHelper.startPage(Integer.parseInt(currentPage), Integer.parseInt(pageSize));
        List<Map<String, Object>> users=userService.seletAllUsers();
        result.put("rows", users);
        return result;
    }

}
