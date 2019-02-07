package com.scxh;

import java.util.ArrayList;
import java.util.Date;

/**
 * ctrl+shift+x : 打开某个类的所在文件夹
 * alter+shift+z : try-catch块
 * 双击shift : 进行文件搜索，就像eclipse的文件搜索功能
 * ctrl+h : 全局搜索
 * ctrl+f : 局部搜索
 * ctrl+alt+f : 将代码收藏到收藏夹
 * ctrl+shift+q : 快速定位到错误位置
 * ctrl+shift+h : 查找方法在哪被调用
 *
 * shift+enter : 快速跳到下一行，eclipse中是ctrl+enter
 * ctrl+shift+enter : 快速跳到上一行
 * alt+enter :  快速提示或者快速生成本地变量,就像eclipse中的ctrl+1
 * alt+shift+r : 快速修改变量名或者方法名。
 * alt+上 : 将代码向上移动一行，eclipse中是ctrl+上
 * alt+下 : 将代码向下移动一行
 * alt+r : 快速执行run方法
 * ctrl+alt+下 ： 快速向下复制一行
 * f4 : 查看继承关系
 * ctrl+shift+f : 格式化代码
 * ctrl+alt+/ : 将光标置于一个方法的括号中可以提示一个方法的参数类型
 * alt+shift+s : 生成构造/get/set/toString方法。
 * ctrl+shift+y : 大小写切换
 * alt+shift+z : 生成tyr-catch块
 */
public class Hello {


    /*
     * 多行注释
     */
    public static void main(String[] args) {

        // 单行注释
        System.out.println("hello");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        System.out.println(list.get(0));
        method1();
    }

    /**
     * 文档注释
     */
    public static void method1() {
        // 使用alt+enter来生成返回值
        Date date = new Date();
        System.out.println(date);
    }
}
