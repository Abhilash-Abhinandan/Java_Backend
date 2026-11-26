package com.abhilash.error;

public class TryWithResourcesPractice4 {
    static class FailingResource implements AutoCloseable {
        private final String name;
        FailingResource(String name) {
            this.name = name;
            System.out.println(name + " opened");
        }
        public void close() {
            System.out.println(name + " closing");
            throw new RuntimeException("close failed: " + name);
        }
    }

    public static void main(String[] args) {
    	try(
    		FailingResource database = new FailingResource("database");
    		FailingResource socket = new FailingResource("socket");
    		FailingResource file = new FailingResource("file");
    		) 
    	{
    		System.out.println("work started");
    		throw new RuntimeException("work failed");
    	} catch(RuntimeException e) {
    		System.out.println("Primary: " + e.getMessage());
    		
    		//Throwable[] suppressed = e.getSuppressed();
    		for(int count = 0; count < e.getSuppressed().length; count++) {
    			System.out.println("Suppressed[" + count + "]: " + e.getSuppressed()[count].getMessage());
    		}
    		
    	} finally {
    		System.out.println("finally ran");
    	}
    }
}