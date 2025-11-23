package org.projects.assignments.flatmaps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CookingFlatMaps {

    // 1️⃣ Flatten list of lists
    // Input: [[1,2,3], [4,5], [6]]
    // Output: [1,2,3,4,5,6]
    public static List<Integer> flattenListOfLists(List<List<Integer>> input) {
        // TODO: implement using flatMap
        return null;
    }

    // 2️⃣ Split list of sentences into list of words
    // Input: ["Hello World", "Java Streams"]
    // Output: ["Hello", "World", "Java", "Streams"]
    public static List<String> splitSentencesIntoWords(List<String> sentences) {
        // TODO: implement using flatMap
        return null;
    }

    // 3️⃣ Extract all unique characters from list of words
    // Input: ["java", "stream"]
    // Output: [j, a, v, s, t, r, e, m]
    public static List<Character> extractCharacters(List<String> words) {
        // TODO: implement using flatMap
        return null;
    }

    // 4️⃣ Flatten a list of optional values
    // Input: [Optional.of(1), Optional.empty(), Optional.of(3)]
    // Output: [1,3]
    public static List<Integer> flattenOptionals(List<Optional<Integer>> optionals) {
        // TODO: implement using flatMap
        return null;
    }

    // 5️⃣ Combine lists of skills from employees
    // Input: [{name:"A", skills:[Java, SQL]}, {name:"B", skills:[Python]}]
    // Output: [Java, SQL, Python]
    public static List<String> extractEmployeeSkills(List<Employee> employees) {
        // TODO: implement using flatMap
        return null;
    }

    // 6️⃣ Convert list of comma-separated strings into integers
    // Input: ["1,2,3", "4,5"]
    // Output: [1,2,3,4,5]
    public static List<Integer> splitCommaSeparatedNumbers(List<String> numbers) {
        // TODO: implement using flatMap
        return null;
    }

    // 7️⃣ Get all words from a map of <String, List<String>>
    // Input: {"A": ["one","two"], "B": ["three"]}
    // Output: ["one", "two", "three"]
    public static List<String> flattenMapValues(Map<String, List<String>> map) {
        // TODO: implement using flatMap
        return null;
    }

    // 8️⃣ Extract domain names from emails
    // Input: ["a@gmail.com", "b@yahoo.com"]
    // Output: ["gmail.com", "yahoo.com"]
    public static List<String> extractDomains(List<String> emails) {
        // TODO: implement using flatMap
        return null;
    }

    // 9️⃣ Expand product variations
    // Input: [{product:"Tshirt", sizes:["S","M"]}, {product:"Shoes", sizes:["8","9"]}]
    // Output: ["Tshirt-S", "Tshirt-M", "Shoes-8", "Shoes-9"]
    public static List<String> expandProductVariations(List<Product> products) {
        // TODO: implement using flatMap
        return null;
    }

    // 🔟 Generate all pair combinations
    // Input: [1,2], [3,4]
    // Output: [(1,3), (1,4), (2,3), (2,4)]
    public static List<String> generatePairs(List<Integer> list1, List<Integer> list2) {
        // TODO: implement using flatMap
        return null;
    }

    // Helper classes for testing
    public static class Employee {
        public String name;
        public List<String> skills;
        public Employee(String name, List<String> skills) {
            this.name = name;
            this.skills = skills;
        }
    }

    public static class Product {
        public String product;
        public List<String> sizes;
        public Product(String product, List<String> sizes) {
            this.product = product;
            this.sizes = sizes;
        }
    }
}
