package com.qalabs.javabasics.googleproject.page;

public interface Page {
  public void open();
  public boolean isLoaded();
  public void close();
}
