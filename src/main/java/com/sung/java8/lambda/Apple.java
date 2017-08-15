package com.sung.java8.lambda;

import lombok.Data;

/**
 * Created by sungang on 2017/8/15.
 */
@Data
public class Apple {
    /** 编号 */
    private long id;

    /** 颜色 */
    private Color color;

    /** 重量 */
    private float weight;

    /** 产地 */
    private String origin;

    public Apple() {
    }

    public Apple(long id, Color color, float weight, String origin) {
        this.id = id;
        this.color = color;
        this.weight = weight;
        this.origin = origin;
    }



}
