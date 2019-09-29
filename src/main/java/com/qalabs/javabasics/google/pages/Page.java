package com.qalabs.javabasics.google.pages;

public interface Page {
    public void open();
    public boolean isLoaded();
    public void close();
}
