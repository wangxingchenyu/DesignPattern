package reg2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * compile()
 * matches()
 * start()
 * end()
 * find()
 * matches()
 * lookAt()
 * replaceFirst()
 * replaceAll()
 * appendReplacement
 * appendTail
 * <p>
 * PatternSyntaxException(解析异常类)
 */
public class test {

    public static void main(String[] args) {
        String reg = "foo";

        String content1 = "foo";
        String content2 = "oooooooooofoo";

        Pattern compile = Pattern.compile(reg);

        Matcher matcher = compile.matcher(content1);
        Matcher matcher1 = compile.matcher(content2);

        /**
         * 完全匹配,equals等同
         */
        System.out.println(matcher.matches());
        /**
         * 必须从第一个查，但是并不是完全的匹配
         */
        System.out.println(matcher.lookingAt());

    }
}
