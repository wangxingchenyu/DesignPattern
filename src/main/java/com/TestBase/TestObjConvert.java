package TestBase;

/**
 * 测试对象转型
 * 1)向上转型,是其父类,也必须是其父类才可以向下转型
 * 2)向下转型,必须是其子类，才可以正常的向下转型
 */

public class TestObjConvert {
    public static void main(String[] args) {
        Object st = new String("hello ");
        if (st instanceof String) {
            char a = ((String) st).charAt(0);
            System.out.println(a);
        } else if (st instanceof StringBuffer) {
            StringBuffer sb = (StringBuffer) st;
            System.out.println(sb.charAt(0));
        }
    }
}




