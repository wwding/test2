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
        String jsonString = JSONObject.toJSONString(map);
        System.out.println(jsonString);
    }
}
