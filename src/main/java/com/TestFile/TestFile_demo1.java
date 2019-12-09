package TestFile;

import java.io.File;

/**
 * 文件操作
 * <p>
 * java.io.File类：代表文件和目录。 在开发中，读取文件、生成文件、删除文件、修改文件的属性时经常会用到本类
 */
public class TestFile_demo1 {
    public static void main(String[] args) throws Exception {

        File f = new File("a.txt");
        // 创建文件
        f.createNewFile();

        // 删除文件
        f.delete();

        md();
    }

    public static void md(){
        File f =  new File("demo/one");
        // 递归创建
        f.mkdirs();

        //
    }

}
