package com.sevenlearn.designpatterns.decorator;

/**
 * Created by user on 2/18/2018.
 */

public abstract class WindowDecorator implements Window {
    protected Window windowToBeDecorator;

    public WindowDecorator(Window window) {
        this.windowToBeDecorator = window;
    }

    @Override
    public void draw() {
        windowToBeDecorator.draw();
    }

    @Override
    public String getDescription() {
        return windowToBeDecorator.getDescription();
    }
}
