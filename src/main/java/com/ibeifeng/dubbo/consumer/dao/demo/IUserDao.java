package com.ibeifeng.dubbo.consumer.dao.demo;

import java.util.List;
import java.util.Map;


public interface IUserDao {

    List<Map<String, Object>> seletAllUsers();
    
    Long seletCountAllUsers();
}
