package cn.day0814.yc._04map;

import java.util.HashMap;

/**
 * @author 杨春
 * @DATE 2022/8/14 14:20
 */
/*
    Map:将键映射到值的对象。 地图不能包含重复的键; 每个键可以映射到最多一个值。

        HashMap:
            常用方法:
            V put(K key, V value)  将指定的值与该映射中的指定键相关联（可选操作）。
            int size()  返回此地图中键值映射的数量。
            V get(Object key)   返回到指定键所映射的值，或 null如果此映射包含该键的映射。
            Set<K> keySet() 返回此地图中包含的键的Set视图。
            Collection<V> values() 返回此地图中包含的值的Collection视图。

 */
public class HashMapTest1 {
    public static void main(String[] args) {
        //HashMap() 构造一个空的 HashMap ，默认初始容量（16）和默认负载系数（0.75）。
        HashMap map =new HashMap();
        //V put(K key, V value)  将指定的值与该映射中的指定键相关联（可选操作）。
        map.put("上官子怡","18");
        map.put("陆小果","19");
        map.put("菠萝吹雪","20");
        map.put("天山果姥","21");
        map.put("橙留香","22");
        map.put("橙留香","24");    //当Key重复，值会被覆盖
        System.out.println(map);
        //返回map键值对的数量
        System.out.println("map的容量是："+map.size());
        //根据key取值
        System.out.println("键为菠萝吹雪的值为："+map.get("菠萝吹雪"));
        //删除并返回键为天山果姥的值
        System.out.println(map.remove("天山果姥"));
        System.out.println(map);

    }

}
