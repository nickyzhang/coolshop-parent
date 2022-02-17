package com.coolshop.base;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class UserNameTools {
    private static final Map<String,String> famyliNames = new HashMap<>();
    private static final Map<String,String> seconds = new HashMap<>();
    private static final Map<String,String> thirds = new HashMap<>();
   static {
        famyliNames.put("赵","zhao");
        famyliNames.put("钱","qian");
        famyliNames.put("孙","sun");
        famyliNames.put("李","li");
        famyliNames.put("周","zhou");
        famyliNames.put("吴","wu");
        famyliNames.put("郑","zheng");
        famyliNames.put("王","wang");
        famyliNames.put("冯","feng");
        famyliNames.put("陈","chen");
        famyliNames.put("褚","chu");
        famyliNames.put("卫","wei");
        famyliNames.put("蒋","jiang");
        famyliNames.put("沈","shen");
        famyliNames.put("韩","han");
        famyliNames.put("杨","yang");
        famyliNames.put("朱","zhu");
        famyliNames.put("秦","qin");
        famyliNames.put("尤","you");
        famyliNames.put("许","xu");
        famyliNames.put("何","he");
        famyliNames.put("陆","lu");
        famyliNames.put("施","shi");
        famyliNames.put("张","zhang");
        famyliNames.put("孔","kong");
        famyliNames.put("曹","cao");
        famyliNames.put("严","yan");
        famyliNames.put("华","hua");
        famyliNames.put("金","jin");
        famyliNames.put("魏","wei");
        famyliNames.put("陶","tao");
        famyliNames.put("姜","jiang");
        famyliNames.put("司马","sima");
        famyliNames.put("夏侯","xiahou");
        famyliNames.put("上官","shangguan");
        famyliNames.put("欧阳","ouyang");
        famyliNames.put("慕容","murong");
        famyliNames.put("澹台","zhantai");

        seconds.put("雨","yu");
        seconds.put("明","ming");
        seconds.put("静","jing");
        seconds.put("艾","ai");
        seconds.put("闻","wen");
        seconds.put("绮","yu");
        seconds.put("瑞","rui");
        seconds.put("开","kai");
        seconds.put("佑","you");
        seconds.put("若","ruo");
        seconds.put("悠","you");
        seconds.put("依","yi");
        seconds.put("信","xin");
        seconds.put("鸿","yi");
        seconds.put("羽","yi");
        seconds.put("庭","yi");
        seconds.put("芮","rui");
        seconds.put("娟","juan");
        seconds.put("毅","yi");
        seconds.put("乐","le");
        seconds.put("锦","jin");
        seconds.put("泽","ze");
        seconds.put("乔","qiao");
        seconds.put("紫","zi");
        seconds.put("楚","chu");
        seconds.put("慧","hui");
        seconds.put("晓","xiao");
        seconds.put("昌","chang");
        seconds.put("熙","xi");
        seconds.put("曦","xi");
        seconds.put("嘉","jia");
        seconds.put("弈","yi");
        seconds.put("诗","shi");
        seconds.put("梦","meng");
        seconds.put("允","yun");


        thirds.put("儿","er");
        thirds.put("然","ran");
        thirds.put("尘","chen");
        thirds.put("诗","shi");
        thirds.put("彤","tong");
        thirds.put("初","chu");
        thirds.put("夜","ye");
        thirds.put("欣","xin");
        thirds.put("瑶","yao");
        thirds.put("瀚","han");
        thirds.put("枫","feng");
        thirds.put("睿","rui");
        thirds.put("涵","han");
        thirds.put("辉","hui");
        thirds.put("萍","ping");
        thirds.put("民","min");
        thirds.put("玉","yu");
        thirds.put("基","ji");
        thirds.put("晨","chen");
        thirds.put("君","jun");
        thirds.put("筠","jun");
        thirds.put("妮","ni");
        thirds.put("如","ru");
        thirds.put("华","hua");
        thirds.put("朗","lang");
        thirds.put("甄","zhen");
        thirds.put("歆","xin");
        thirds.put("弈","yi");
        thirds.put("诗","shi");
        thirds.put("梦","meng");
    }

    public static Map<String,String> generateName(int len){
        Map<String,String> map = new HashMap<>();
        StringBuilder userNameBuilder = new StringBuilder();
        StringBuilder emailBuilder = new StringBuilder();
        Object[] familyNameList = (Object[])famyliNames.values().toArray();
        String familyName = familyNameList[new Random().nextInt(familyNameList.length)].toString();
        userNameBuilder.append(familyName);
        emailBuilder.append(familyName).append(".");
        if (len == 2) {
            Object[] secondList = (Object[])seconds.values().toArray();
            String second = secondList[new Random().nextInt(secondList.length)].toString();
            userNameBuilder.append(second).append(new Random().nextInt(999));
            emailBuilder.append(second);
        } else if (len == 3) {
            Object[] secondList = (Object[])seconds.values().toArray();
            String second = secondList[new Random().nextInt(secondList.length)].toString();

            Object[] thirdList = (Object[])thirds.values().toArray();
            String third = thirdList[new Random().nextInt(thirdList.length)].toString();
            userNameBuilder.append(second).append(third).append(new Random().nextInt(999));;
            emailBuilder.append(second).append(third);
        }
        map.put(userNameBuilder.toString(),emailBuilder.toString());
        return map;
    }
}
