package bawei.com.zhouwangwei20170926;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/**
 * Created by Mr.周 on 2017/9/26.
 */

public class Tools {
    public static String getIs(InputStream inputStream) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        try {
            while ((len = inputStream.read(bytes)) != -1) {
                baos.write(bytes, 0, len);
            }
            baos.close();
            inputStream.close();
            return baos.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
