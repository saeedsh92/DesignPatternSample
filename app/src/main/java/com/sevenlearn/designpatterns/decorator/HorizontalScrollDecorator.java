package com.sevenlearn.designpatterns.decorator;

/**
 * Created by user on 2/18/2018.
 */

public class HorizontalScrollDecorator extends WindowDecorator {

    public HorizontalScrollDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        super.draw();
        drawHorizontalScrollBar();
    }

    private void drawHorizontalScrollBar() {
        //Draw horizontal scrollbar
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", added horizontal scrollbar";
    }
}
