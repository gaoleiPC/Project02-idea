package com.scxh;

import java.util.ArrayList;
import java.util.List;

/**
 * 模板的应用，如eclipse的Syso,就可以得到System.out.println();
 * IDEA中代码模板所处的位置：settings - Editor - Live Templates
 * 或者：settings - Editor - General - Postfix Completion
 * @author gaole
 * @date 2018-12-19 17:30
 */
public class TemplatesTest {

    // 常用模板1：psvm，就是main方法的快捷方式
    public static void main(String[] args) {

        // 常用模板2：sout/soutp/soutv/soutm/xxx.sout，就是eclipse中的Syso
        System.out.println();   //sout
        System.out.println("TemplatesTest.main");   // soutm
        System.out.println("args = " + args);   // soutv
        System.out.println("args = [" + args + "]");    // soutp
        System.out.println(args);   // args.sout


        // 常用模板3：fori/itar，一般for循环
        for (int i = 0; i < 2; i++) {
            System.out.println(i);
        }



        // 常用模板4：iter，增强for循环，也就是foreach循环
        for (String arg : args) {
            System.out.println(arg);
        }

        // 常用模板5：xxx.for/xxx.fori/xxx.forr，如list.for，生成list集合的for循环遍历。
        List<String> list = new ArrayList<>();
        for (String s : list) {
            System.out.println(s);
        }

        // 常用模板6：ifn/inn，生成if( xxx == null)或者if(xxx != null)
        if (list == null) {
            System.out.println("null");
        }
        if (list != null) {
            System.out.println("not null");
        }

    }

    // 其它模板：psf/psfi/psfs，快速生成方法 public static final int/String
    // prsf: private static final
}
