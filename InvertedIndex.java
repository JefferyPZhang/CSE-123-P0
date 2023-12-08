// Jeffery Zhang
// TA: Jake Page
// CSE 123
// October 2nd, 2023
// Classes/Interfaces - Media

import java.util.*;

// This class represents a crude search engine, in which search terms
// are used to find titles.

public class InvertedIndex {
    public static void main(String[] args) {
        List<String> docs = new ArrayList<>();
        docs.add("Raiders of the Lost Ark");
        docs.add("The Temple of Doom");
        docs.add("The Last Crusade");
        Map<String, Set<String>> result = createIndex(docs);
        System.out.println("\n" + docs);
        System.out.println(result);
    }

    // Behavior:
    //  - This method finds potential titles based on a search word.
    // Parameters:
    //  - docs: An ArrayList of Strings, representing all the searchable titles.
    // Returns:
    //  - Index: a map with a potential word used to find a title
    //    as the key and the corresponding title as the value.
    //    It is also case-insensitive.
    public static Map<String, Set<String>> createIndex(List<String> docs) {
        Map<String, Set<String>> index = new TreeMap<>();
        for (String title : docs) {
            String[] words = title.split(" ");
            for (String word : words) {
                String wordLowerCase = word.toLowerCase();
                if (!index.containsKey(wordLowerCase)) {
                    Set<String> titles = new HashSet<>();
                    index.put(wordLowerCase, titles);
                }
                index.get(wordLowerCase).add(title);
            }
        }
        return index;
    }
}

