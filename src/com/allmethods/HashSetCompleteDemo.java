package com.allmethods;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCompleteDemo {
    public static void main(String[] args) {
        // 1. Initializing a HashSet
        HashSet<String> set = new HashSet<>();

        // 2. add(E e) - Adds an element if it is not already present
        System.out.println("--- Adding Elements ---");
        System.out.println("Adding 'Java': " + set.add("Java")); // returns true
        System.out.println("Adding 'Python': " + set.add("Python")); // returns true
        System.out.println("Adding 'C++': " + set.add("C++")); // returns true
        System.out.println("Adding duplicate 'Java': " + set.add("Java")); // returns false
        System.out.println("Current Set: " + set);

        // 3. contains(Object o) - Checks if an element exists
        System.out.println("\n--- Checking Existence ---");
        System.out.println("Contains 'Python'? " + set.contains("Python")); // true
        System.out.println("Contains 'Ruby'? " + set.contains("Ruby")); // false

        // 4. size() - Returns the total number of elements
        System.out.println("\n--- Set Metrics ---");
        System.out.println("Size of set: " + set.size());

        // 5. isEmpty() - Checks if the set contains no elements
        System.out.println("Is set empty? " + set.isEmpty());

        // 6. iterator() - Returns an iterator over the elements
        System.out.println("\n--- Iterating Elements ---");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 7. clone() - Creates a shallow copy of the HashSet instance
        System.out.println("\n--- Cloning Set ---");
        @SuppressWarnings("unchecked")
        HashSet<String> clonedSet = (HashSet<String>) set.clone();
        System.out.println("Cloned Set: " + clonedSet);

        // 8. remove(Object o) - Removes a specific element
        System.out.println("\n--- Removing Elements ---");
        System.out.println("Removing 'C++': " + set.remove("C++")); // true
        System.out.println("Removing 'Ruby' (not present): " + set.remove("Ruby")); // false
        System.out.println("Set after removal: " + set);

        // 9. clear() - Removes all elements from the set
        System.out.println("\n--- Clearing Set ---");
        set.clear();
        System.out.println("Set after clear(): " + set);
        System.out.println("Is set empty now? " + set.isEmpty());
    }
}
