package cn.day0814.yc._04map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 杨春
 * @DATE 2022/8/15 11:37
 */

/**
 *      map的遍历：重要  掌握
 *          普通for
 *          foreach
 *          迭代器
 *          以上三个都不能用
 */
public class HashMapTest3 {
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

        /*map的遍历   方式一【重点掌握】：map的遍历方式—:Set<K> keySet()     返回此map中包含的键的Set视图。【把map容器里面所有的key以set的形式返回】
         */
        Set set = map.keySet();
        //遍历所有的key   根据key去取值
        for (Object key:set ) {
            //System.out.println(key+"-----"+map.get(key));
            }

        /*
            遍历方式二:
                Set<Map.Entry<K,V>> entrySet() 返回此地图中包含的映射的Set视图。
                    Map.Entry
                        K   getKey()
                        V   getValue();
         */
        Set set1 = map.entrySet();
        for (Object o:set1 ) {
            //o的真实类型是HashMap下面的Node类型
            System.out.println(o.getClass());
            //强转为Entry类型
            Map.Entry entry=(Map.Entry)o;   //使用接口去接收实现类对象
            Object key=entry.getKey();      //获取到单个数据的key
            Object value=entry.getValue();  //获取单个数据的value
            System.out.println(key+"-----"+value);
        }

    }
}
