package testFileIo;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test02 {
    public static void main(String[] args) throws IOException {
        Test02 test02 = new Test02();
        test02.readImage();
    }

    public void readImage() throws IOException {
        byte[] buffer = new byte[1024];
        InputStream resourceAsStream = this.getClass().getResourceAsStream("http://img20.360buyimg.com/ee/jfs/t25015/100/758106622/14615/4995edd8/5b7a4994N2636ae9e.png");
        FileOutputStream fileOutputStream = new FileOutputStream("d/io/tt.png");
        int len = 0;

        while ((len = resourceAsStream.read(buffer)) != -1) {
            fileOutputStream.write(buffer,0,len);
        }
    }
}
