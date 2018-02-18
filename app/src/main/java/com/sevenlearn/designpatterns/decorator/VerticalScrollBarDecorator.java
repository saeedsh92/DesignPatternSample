package com.sevenlearn.designpatterns.decorator;

/**
 * Created by user on 2/18/2018.
 */

public class VerticalScrollBarDecorator extends WindowDecorator {
    public VerticalScrollBarDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        super.draw();
        addVerticalScrollbar();
    }

    private void addVerticalScrollbar(){

    }


    @Override
    public String getDescription() {
        return super.getDescription()+", added vertical scrollbar";
    }
}
