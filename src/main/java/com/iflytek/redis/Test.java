package com.iflytek.redis;



import com.alibaba.fastjson.JSONObject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
       /* List list=new ArrayList();
        String alias="cccccccccccc";
        alias = "\""+alias+"\"";

        String episode="ddddddddd";
        episode = "\""+episode+"\"";

        list.add(alias);
        list.add(episode);
       // list.add("bb");
       // list.add("cc");
        String s = list.toString();
        System.out.println(s);
*/
       String path="E:\\data\\kettle\\data\\wwding\\";
        File file = new File(path);
        File filelist[] = file.listFiles();
        for (int i=0;i<filelist.length;i++){
            String filename = filelist[i].getName();
            if (filename.endsWith("txt")) {
                filelist[i].delete();
            }

        }

    }
}
