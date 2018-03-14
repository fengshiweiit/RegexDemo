import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLanguage {

    @Test
    public void test1(){
        //匹配数字
        String compile = "\\d";
        String compile2 = "[0-9]";
        String match = "1";
        System.out.println(pattern(compile, match));
        System.out.println(pattern(compile2, match));

        //匹配非数字
        String compile1 = "\\D";
        String match1 = "1";
        System.out.println(pattern(compile1, match1));
    }

    @Test
    public void test2() {
        //匹配数字3到6次
        String compile = "[\\d]{3,6}";
        String match = "123456";
        String match2 = "1234567";
        System.out.println(pattern(compile, match));
        System.out.println(pattern(compile, match2));
    }

    @Test
    public void test3(){
        // \\w匹配字符 相当于[a-zA-Z0-9]
        String compile = "\\w{0,}";
        String match = "123456";
        System.out.println(pattern(compile, match));

        //匹配非字符
        String compile1 = "\\W{0,}";
        String match2 = "!";
        System.out.println(pattern(compile1, match2));
    }

    @Test
    public void test4() {
        //匹配到除了bc以外的所有小写字母
        String compile = "[a-z&&[^bc]]";
        String match = "b";
        System.out.println(pattern(compile, match));
    }

    public boolean pattern(String compile, String match){
        Pattern pattern = Pattern.compile(compile);
        Matcher matcher = pattern.matcher(match);
        return matcher.matches();
    }
}
