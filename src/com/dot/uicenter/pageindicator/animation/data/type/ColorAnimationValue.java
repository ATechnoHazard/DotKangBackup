package com.dot.uicenter.pageindicator.animation.data.type;

import com.dot.uicenter.pageindicator.animation.data.Value;

public class ColorAnimationValue implements Value {

    private int color;
    private int colorReverse;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColorReverse() {
        return colorReverse;
    }

    public void setColorReverse(int colorReverse) {
        this.colorReverse = colorReverse;
    }
}
