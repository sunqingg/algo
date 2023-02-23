package sun;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class UseDigui {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String s = new String("haxi");
        //解码时切记，GBK中文两个元素解码成一个中文，UTF-8 3个元素解码成一个中文。
        byte[] nums = {97,98,99,-50,-46,-80,-82};
        String s1 = new String(nums,"GBK");
        System.out.println(s);
        System.out.println(s1);

    }



}
