import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[\\d]{3}");
        Matcher matcher = pattern.matcher("9879a13a456");

        boolean matches = matcher.matches();
        //第一次匹配之后如果不掉用reset方法 下次匹配的时候不会匹配此次
        boolean find = matcher.find();
        System.out.println("matches================================" + matches);
        System.out.println("find===================================" + find);
        //重置匹配的
        matcher.reset();
        //从第一个字符串开始匹配（局部匹配）
        boolean lookingAt = matcher.lookingAt();
        System.out.println("lookingAt============================" + lookingAt);
        boolean find1 = matcher.find();
        System.out.println("find1===================================" + find1);

        //使用了find方法之后，start方法相当于indexOf的作用 获取匹配到的索引，若没有匹配到会抛出异常
        int start = matcher.start();
        System.out.println(start);

        //得到匹配的值
        String group = matcher.group();
        System.out.println(group);
        //这里的lookingAt匹配到的应该是456
        boolean b = matcher.lookingAt();
        System.out.println(b);
    }
}
