package cn.day0806.yc._05String;

import java.util.Arrays;

/*

    常见方法：
        charAt(int index)                           返回 char指定索引处的值。
        endsWith(String suffix)                     测试此字符串是否以指定的后缀结尾。
        indexOf(int ch)                             返回指定字符第一次出现的字符串内的索引。
        isEmpty()                                   返回 true如果，且仅当 length()为 0 。
        lastIndexOf(int ch)                         返回指定字符的最后一次出现的字符串中的索引。
        length()                                    返回此字符串的长度。
        replace(char oldChar, char newChar)         返回从替换所有出现的导致一个字符串 oldChar在此字符串 newChar 。
        String[] split(String regex)                         将此字符串分割为给定的regular expression的匹配
        substring(int beginIndex, int endIndex)     返回一个字符串，该字符串是此字符串的子字符串。
        toCharArray()                               将此字符串转换为新的字符数组。
        toLowerCase()                               将所有在此字符 String使用默认语言环境的规则，以小写。
        trim()                                      返回一个字符串，其值为此字符串，并删除任何前导和尾随空格。
        toUpperCase()                               将所有在此字符 String使用默认语言环境的规则大写。

    练习：
        涉及一个方法，传入一个手机号，经过方法处理以后中间4位变更为****
        例如 这个方法如下

        StringMethodTest.phoneUtils("15008495702");
        电话号码变更为150****5702
 */
public class StringMethodTest {
    public static void main(String[] args) {
        String str="天涯明月刀.avi";
        //charAt    返回 char指定索引处的值。
        char charAt=str.charAt(1);
        System.out.println(charAt);
        //endsWith  测试此字符串是否以指定的后缀结尾。
        boolean b=str.endsWith("avi");
        System.out.println(b);
        //indexOf   返回指定字符第一次出现的字符串内的索引。
        System.out.println(str.indexOf("刀"));
        //isEmpty   返回 true如果，且仅当 length()为 0 。
        System.out.println(str.isEmpty());
        //返回此字符串的长度。
        System.out.println(str.length());
        //replace(char oldChar, char newChar)  返回从替换所有出现的导致一个字符串 oldChar在此字符串 newChar 。
        System.out.println(str.replace("天涯明月刀","姐姐的朋友"));
        //String[] split(String regex)     regex：分割的规则     将此字符串分割为给定的regular expression的匹配
        String name="宋远桥、俞莲舟、俞岱岩、张松溪、张翠山、殷梨亭、莫声谷";
        String[] split=name.split("、");
        System.out.println(Arrays.toString(split));
        System.out.println(split[3]);
        //substring(int beginIndex, int endIndex)     返回一个字符串，该字符串是此字符串的子字符串。
        String st="123456789";
        //起始位置下标2开始截取【包含】
        System.out.println(st.substring(2));
        //起始位置下标2开始截取,到4结束【)左闭右开
        System.out.println(st.substring(2,4));
        //toCharArray()     将此字符串转换为新的字符数组。
        char[]array=str.toCharArray();
        System.out.println(array);
        //toUpperCase()  将所有在此字符 String使用默认语言环境的规则大写。
        System.out.println(str.toUpperCase());
        //toLowerCase()   将所有在此字符 String使用默认语言环境的规则小写。
        System.out.println(str.toLowerCase());

        System.out.println(str);


        char[]arr={'a','b','c'};
        System.out.println(arr);
        System.out.println(StringMethodTest.phoneUtils("13032130381"));

    }

    public static String phoneUtils(String phone){

        if(!(phone.length()==11)){
            System.out.println("您的电话长度不对");
            return null;
        }
        return phone.substring(0, 3) + "****" + phone.substring(7, phone.length());

//        StringBuilder stringBuilder=new StringBuilder(phone);
//        stringBuilder.replace(3,7,"****");
//        System.out.println(stringBuilder);



    }
}
