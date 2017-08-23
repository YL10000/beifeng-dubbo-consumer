package com.ibeifeng.dubbo.consumer.service;

import java.util.List;
import java.util.Map;

public interface IUserService {
    
    List<Map<String, Object>> seletAllUsers();
    
    Long seletCountAllUsers();
}
