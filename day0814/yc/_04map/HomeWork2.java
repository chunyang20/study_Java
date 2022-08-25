package cn.day0814.yc._04map;

import java.util.HashMap;
import java.util.Set;

/**
 * @author 杨春
 * @DATE 2022/8/14 17:14
 */
public class HomeWork2 {
    public static void main(String[] args) {
        //定义一个字符串
        String str="AAAABBBBBCCCDDDEFF";
        //将字符串转换为字符数组
        char[] chars = str.toCharArray();
        //定义一个map容器
        HashMap map=new HashMap();
        //假设字母次数最多的是第一个字符
        char maxChar= chars[0];
        //增强for遍历chars
        for (char o:chars ) {
            //如果map获得的键的值不为空
            if (map.get(o)!=null){
                //定义一个sum用来存储遍历的元素的value
                int sum=(int)map.get(o);
                //sum就要+1
                sum +=1;
                //覆盖key为o的value
                map.put(o,sum);
                //如果key为o的value大于key为maxChar的value
                if ((int)map.get(o)>(int)map.get(maxChar)){
                    //那么出现次数最多的就为o
                    maxChar=o;
                }
            }else {
                //如果map增加第一个元素为空，那么将遍历的第一个元素增加到容器，设置值为1
                map.put(o,1);
            }
        }
        //定义一个set用来存储map的键
        Set set = map.keySet();
        //增强for遍历
        for (Object o:set ) {
            //打印输出键为o的值
            System.out.println(o+"---"+map.get(o));

        }
        System.out.println("打印字母次数最多的那一对");
        //打印输出次数最多的键对应的 值
        System.out.println(maxChar+"-----"+map.get(maxChar));



    }
}
