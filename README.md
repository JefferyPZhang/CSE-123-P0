**Assignment Spec:**

"This assignment is intended to be a review and warm up for CSE 123. It will require you to use the skills and concepts that you should be familiar with from your prior programming experience."

**Collections/Reference Semantics - Debugging**
One of the TAs has been programming in Python for too long, and forgot how to code in Java! They wrote a solution to the following problem, but accidentally included some bugs:
There are 5 bugs in the following program. Find and fix them all!

Use left and right arrow keys to adjust the split region size

**Collections - Inverted Index**
Write a method called createIndex that creates an inverted index for a list of documents. Your method should take one argument, a list of "documents" where each document is represented as a string. Your method should return a map where the keys are individual words that appear in the parameter list of documents and the values are sets of documents in which those words appear.

For example, suppose the variable titles contains the following list:

[Raiders of the Lost Ark, The Temple of Doom, The Last Crusade]
In this case, the call createIndex(titles) would return the following map:

{ark=[Raiders of the Lost Ark], crusade=[The Last Crusade], doom=[The Temple of Doom], last=[The Last Crusade], 
 lost=[Raiders of the Lost Ark], of=[The Temple of Doom, Raiders of the Lost Ark], raiders=[Raiders of the Lost Ark], 
 temple=[The Temple of Doom], the=[The Temple of Doom, The Last Crusade, Raiders of the Lost Ark]}
The keys of the returned map should be case-insensitive (i.e. treat "The" and "the" as the same word). The keys of the returned map should be in sorted order, while the sets in the values should prefer fast lookup speed.

You may assume that the parameter passed in non-null, that each element of the parameter is a non-empty string, and that words in each document are separated by a single space.

**Classes/Interfaces - Media**
Write a Java class called Book that implements the provided Media interface and represents a book. For books, the artists are considered to be the author(s).

Your class should have two constructors:

public Book(String title, String author)
Creates a book with the provided title and single author.

public Book(String title, List<String> authors)
Creates a book with the provided title and multiple authors.

The title and author(s) should not be able to be modified by a client after creation.

In addition to the methods required by the interface, your Book class should include a toString() method to produce a readable string representation. If the book has zero ratings, the string representation should be:

<name> by [<authors>]: No ratings yet!
If the book has at least one review, the string representation should be:

<name> by [<authors>]: <average rating> (<num ratings> ratings)
The average rating should be rounded to at most two decimal places in the string representation only. (The getAverageRating method should return the actual average without rounding.)
