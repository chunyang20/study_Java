package cn.day0814.yc._05properties;

import java.io.*;
import java.util.Properties;

/**
 * @author 杨春
 * @DATE 2022/8/14 16:18
 */

/**
 *      Map
 *       |-- Hashtable---后来被HashMap替换，Hashtable是线程安全的
 *          |-- properties
 *
 *          String getProperty(String key)  使用此属性列表中指定的键搜索属性。
 *          Object setProperty(String key, String value) 致电 Hashtable方法 put 。
 *
 *          properties：经常用于读写配置文件
 *
 */
public class PropertiesTest {
    public static void main(String[] args) throws Exception {

        Properties ps=new Properties();
        //往map里面添加数据（必须是String类型）
        ps.setProperty("root","123456");
        ps.setProperty("admin","123");
        System.out.println(ps.getProperty("root"));


        /*
                写出为配置文件
                void list(PrintStream out) 将此属性列表打印到指定的输出流。
         */

        PrintStream out=new PrintStream(new File("D:/db.properties"));
        ps.list(out);
        /*
                读取配置文件
         */
        Properties ps2=new Properties();
        Reader inStream=new FileReader(new File("D:/通讯录.properties"));
        ps2.load(inStream);
        System.out.println(ps2);
    }
}
