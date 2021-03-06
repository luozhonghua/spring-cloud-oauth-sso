package com.peterwanghao.spring.cloud.oauth.authresource.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.peterwanghao.spring.cloud.oauth.authresource.model.Person;

/**   
 * @ClassName:  PersonInfoController
 * @Description:提供REST服务接口供客户端调用
 * @author: luozhonghua
 * @date:   2018年7月19日 下午2:43:05
 * @version V1.0
 * 
 */
@RestController
public class PersonInfoController {

    @GetMapping("/person")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public @ResponseBody Person personInfo() {
        return new Person("peter", "Beijing", "China", 29, "Male");
    }   
}
