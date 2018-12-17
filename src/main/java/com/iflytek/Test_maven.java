package com.iflytek;

import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;

public class Test_maven {
    public static void main(String[] args) {
        String aa="丁稳稳";
       String bb=null;
       String cc="{\"id\":\"JV154007\",\"专业\":\"软件工程\"}";
        Map map=new HashMap();
       JSONObject jsonObject = JSONObject.parseObject(cc);
       bb = jsonObject.getString("id");
       System.out.println(bb);
        map.put("name",aa);
       map.put("ID",bb);
       map.put("user",cc);
        System.out.println("development分支");
        System.out.println();
        System.out.println("我不是不是不是克隆");
        System.out.println("我在修改文件，ignored files 发现了");
        System.out.println("我又修改了一行代码");
        System.out.println("wwding@iflytek.com");
        System.out.println("..................");
        System.out.println("我又重新设置了局部签名");
        String jsonString = JSONObject.toJSONString(map);
        System.out.println(jsonString);
    }
}
