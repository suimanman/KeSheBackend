package com.keshe.backend.controller;

import com.keshe.backend.pojo.TestPojo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/getList")
    public TestPojo getPojoList(){
        TestPojo testpojo=new TestPojo();
        testpojo.setName("王梅策");
        testpojo.setImgPath("https://tse2-mm.cn.bing.net/th/id/OIP-C.kmR2P7xa78Rq6v20OWTCWwAAAA?w=192&h=284&c=7&r=0&o=5&pid=1.7");
        testpojo.setAge(22);
        return testpojo;
    }
    @GetMapping("/getname")
    public String getName(){
        return "王梅策";
    }
}
