package com.abhilash.error;

public class AverageRating {
	public static void main(String args[]) {
		String[] ratings = {};
		
		try {
			int sum = 0;
			for (int count  = 0; count < ratings.length; count++) {
				int rating = Integer.parseInt(ratings[count]);
				sum += rating;
			}
			
			int count = ratings.length;
			double average = sum / count;
		} catch (NumberFormatException e) {
			System.out.println("One of the ratings isn't a number: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ratings list is shorter than expected.");
		} catch (ArithmeticException e) {
			System.out.println("Cannot compute an average with zero ratings.");
		}
	}
}
