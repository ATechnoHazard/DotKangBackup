package com.dot.uicenter.pageindicator.draw.drawer.type;

import android.graphics.Paint;
import android.support.annotation.NonNull;
import com.dot.uicenter.pageindicator.draw.data.Indicator;

class BaseDrawer {

    Paint paint;
    Indicator indicator;

    BaseDrawer(@NonNull Paint paint, @NonNull Indicator indicator) {
        this.paint = paint;
        this.indicator = indicator;
    }
}
