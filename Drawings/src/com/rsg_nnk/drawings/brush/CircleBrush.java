package com.rsg_nnk.drawings.brush;

import android.graphics.Path;

public class CircleBrush extends Brush{

    @Override
    public void mouseMove(Path path, float x, float y) {
        path.addCircle(x,y,10,Path.Direction.CW);
    }

}
