package com.abhilash.error;

public class Main1 {
	  static class R implements AutoCloseable {
	    public void close() throws Exception {
	      System.out.println("closing");
	      throw new Exception("close");
	    }
	  }
	  public static void main(String[] args) {
	    try (R r = new R()) {
	      throw new Exception("body");
	    } catch (Exception e) {
	      System.out.println(e.getMessage());
	      System.out.println(e.getSuppressed()[0].getMessage());
	    }
	  }
	}

// Explanation: The body throws Exception("body"). During cleanup, close() prints closing and throws Exception("close"). The body exception remains primary, while the close exception is suppressed and available through getSuppressed().