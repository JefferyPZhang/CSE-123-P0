// Jeffery Zhang
// TA: Jake Page
// CSE 123
// October 2nd, 2023
// Classes/Interfaces - Media

import java.util.*;

// This is a Book that implements Media. It takes in info about a book, then returns useful
// conclusions about the book.

public class Book implements Media {
    private final String title;
    private final List<String> authors;
    private final List<Integer> ratings;

    // Constructs a new book, using the String title 
    // and a String author as parameters, for the case
    // in which the book has only one author.
    public Book(String title, String author) {
        this.title = title;
        this.authors = new ArrayList<>();
        authors.add(author);
        this.ratings = new ArrayList<>();
    }

    // Constructs a new book, using the String title 
    // and a an ArrayList of authors as parameters,
    // for the case in which the book has multiple authors.
    public Book(String title, List<String> authors) {
        this.title = title;
        this.authors = authors;
        this.ratings = new ArrayList<>();
    }

    // Post: returns the title of the book to the client.
    @Override
    public String getTitle() {
        return title;
    }

    // Post: returns the list of artists of the book to the client.
    @Override
    public List<String> getArtists() {
        return authors;
    }

    // Post: returns the # of ratings of the book to the client.
    @Override
    public int getNumRatings() {
        return ratings.size();
    }

    // Post: returns the average rating of the book to the client.
    @Override
    public double getAverageRating() {
        int ratingSum = 0;
        if (getNumRatings() == 0) {
            return 0.0;
        } else {
            for (Integer rating : ratings) {
                ratingSum += rating;
            }
            return (double) ratingSum / getNumRatings();
        }
    }

    // Post: adds a rating given by the client to the current list of ratings.
    @Override
    public void addRating(int score) {
        ratings.add(score);
    }

    // Post: returns a String representation of information about the book,
    // and an alternative String representation when there are no ratings.
    // Additionally, the average rating is rounded to two decimal places.
    public String toString() {
        String toPrint = getTitle() + " by " + getArtists() + ": ";
        if (!ratings.isEmpty()) {
            toPrint += Math.round(getAverageRating() * 100.0) / 100.0 + " (" + getNumRatings() + " ratings)";
        } else toPrint += "No ratings yet!";
        return toPrint;
    }
}

