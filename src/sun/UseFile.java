package sun;

import sun.java2d.pipe.SpanShapeRenderer;

import javax.swing.plaf.synth.SynthToolTipUI;
import java.io.File;
import java.text.SimpleDateFormat;

public class UseFile {
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
        File f1 = new File("E:\\java_study\\src\\sun\\webwxgetmsgimg.jpg");
//        System.out.printf(" "+ f1.lastModified());
//        System.out.printf(f1.getAbsolutePath());
//        System.out.printf(f1.getName());
        System.out.printf(String.valueOf(f1.length()));
        System.out.println("\n" + f1.lastModified());
        long time = f1.lastModified();
        System.out.println("" + sdf.format(time));
        String time_1 = "1644496115281";
//        Long l = Long.parseLong(time_1)
        System.out.println(sdf.format(Long.parseLong(time_1)));
        System.out.println(f1.isDirectory());

//        long time = f1.lastModified();
//        System.out.printf("" +f1.length());
//        System.out.printf(" " + time);
//        System.out.printf(" " +  sdf.format(time));
    }
}
