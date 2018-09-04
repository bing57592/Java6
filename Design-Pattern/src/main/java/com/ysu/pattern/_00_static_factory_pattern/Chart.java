/**
 * Copyright (c) 2015, www.jd.com. All rights reserved.
 * <p/>
 * 警告：本计算机程序受著作权法和国际公约的保护，未经授权擅自复制或散布本程序的部分或全部、以及其他
 * 任何侵害著作权人权益的行为，将承受严厉的民事和刑事处罚，对已知的违反者将给予法律范围内的全面制裁。
 */
package com.ysu.pattern._00_static_factory_pattern;

/**
 * Created by 陈宪东 on 2018/9/4 17:34
 */
public class Chart {
    protected void draw() {
        System.out.println("画图");
    }

    protected void erase() {
        System.out.println("擦图");
    }

    public static Chart Factory(String str) throws Exception {
        if ("circular".equals(str)) {
            Circular circular = new Circular();
            circular.setRadius(1.0);
            return circular;
        }
        if ("rectangle".equals(str)) {
            Rectangle rectangle = new Rectangle();
            rectangle.setLenght(2.0);
            rectangle.setWeight(1.0);
            return rectangle;
        }
        if ("square".equals(str)) {
            Square square = new Square();
            square.setLenght(1.0);
            return square;
        }
        throw new Exception();
    }
}
