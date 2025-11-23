package org.projects.assignments.l1;

import org.projects.assignments.models.Employee;

import java.util.List;
import java.util.Map;

public class L1Assignment {

	/**
	 * 1. Sum of All Numbers in a List Example: Given a list of integers, calculate
	 * the sum of all numbers. Example: Numbers: [1, 2, 3, 4, 5] Output: 15
	 * Explanation: 1 + 2 + 3 + 4 + 5 = 15
	 */
	public int sumOfNumbers(List<Integer> numbers) {
		// write code here using Java Streams API
		return -1;
	}

	/**
	 * 2. Find Maximum Number in a List Example: Given a list of integers, find the
	 * maximum number. Example: Numbers: [10, 5, 20, 8, 15] Output: 20 Explanation:
	 * 20 is the largest number in the list.
	 */
	public int findMaxNumber(List<Integer> numbers) {
		// write code here using Java Streams API
		return -1;
	}

	/**
	 * 3. Filter Even Numbers from a List Example: Given a list of integers, return
	 * only the even numbers. Example: Numbers: [1, 2, 3, 4, 5, 6, 7, 8] Output: [2,
	 * 4, 6, 8] Explanation: Only numbers divisible by 2 are returned.
	 */
	public List<Integer> filterEvenNumbers(List<Integer> numbers) {
		// write code here using Java Streams API
		return null;
	}

	/**
	 * 4. Convert List of Strings to Uppercase Example: Given a list of strings,
	 * convert all strings to uppercase. Example: Strings: ["apple", "banana",
	 * "cherry"] Output: ["APPLE", "BANANA", "CHERRY"] Explanation: Each string is
	 * transformed to uppercase using map operation.
	 */
	public List<String> convertToUppercase(List<String> strings) {
		// write code here using Java Streams API
		return null;
	}

	/**
	 * 5. Remove Duplicate Elements from a List Example: Given a list of integers,
	 * remove all duplicate elements. Example: Numbers: [1, 2, 2, 3, 4, 4, 5]
	 * Output: [1, 2, 3, 4, 5] Explanation: distinct() removes duplicate elements
	 * keeping only unique values.
	 */
	public List<Integer> removeDuplicates(List<Integer> numbers) {
		// write code here using Java Streams API
		return null;
	}

	/**
	 * 6. Check if All Numbers are Positive Example: Given a list of integers, check
	 * if all numbers are positive. Example: Numbers: [1, 2, 3, 4, 5] Output: true
	 * Explanation: All numbers in the list are greater than 0.
	 */
	public boolean areAllPositive(List<Integer> numbers) {
		// write code here using Java Streams API
		return false;
	}

	/**
	 * 7. Count Strings Starting with a Specific Letter Example: Given a list of
	 * strings, count how many start with the letter 'A'. Example: Strings:
	 * ["Apple", "Banana", "Apricot", "Cherry", "Avocado"] Output: 3 Explanation:
	 * "Apple", "Apricot", and "Avocado" start with 'A'.
	 */
	public long countStringsStartingWith(List<String> strings, char letter) {
		// write code here using Java Streams API
		return -1;
	}

	/**
	 * 8. Square Each Number and Collect to List Example: Given a list of integers,
	 * square each number. Example: Numbers: [1, 2, 3, 4, 5] Output: [1, 4, 9, 16,
	 * 25] Explanation: Each number is multiplied by itself (n * n).
	 */
	public List<Integer> squareNumbers(List<Integer> numbers) {
		// write code here using Java Streams API
		return null;
	}

	/**
	 * 9. Skip First N Elements and Collect Remaining Example: Given a list of
	 * integers, skip the first 3 elements and return the rest. Example: Numbers:
	 * [1, 2, 3, 4, 5, 6, 7, 8] Output: [4, 5, 6, 7, 8] Explanation: skip(3) skips
	 * the first 3 elements and returns remaining elements.
	 */
	public List<Integer> skipFirstN(List<Integer> numbers, int n) {
		// write code here using Java Streams API
		return null;
	}

	/**
	 * 10. Join Strings with a Delimiter Example: Given a list of strings, join them
	 * with a comma separator. Example: Strings: ["Java", "Python", "JavaScript",
	 * "C++"] Output: "Java, Python, JavaScript, C++" Explanation:
	 * Collectors.joining() concatenates all strings with the specified delimiter.
	 */
	public String joinStrings(List<String> strings, String delimiter) {
		// write code here using Java Streams API
		return null;
	}

	/**
	 * 11. Find First Element Greater Than N Example: Given a list of integers, find
	 * the first number greater than 10. Example: Numbers: [5, 8, 12, 3, 15, 7]
	 * Output: 12 Explanation: 12 is the first number in the list that is greater
	 * than 10.
	 */
	public Integer findFirstGreaterThan(List<Integer> numbers, int threshold) {
		// write code here using Java Streams API
		return null;
	}

	/**
	 * 12. Sort Strings by Length Example: Given a list of strings, sort them by
	 * their length in ascending order. Example: Strings: ["apple", "kiwi",
	 * "banana", "pear"] Output: ["kiwi", "pear", "apple", "banana"] Explanation:
	 * Strings are sorted by length: kiwi(4), pear(4), apple(5), banana(6).
	 */
	public List<String> sortByLength(List<String> strings) {
		// write code here using Java Streams API
		return null;
	}

	/**
	 * 13. Flatten Nested List Example: Given a list of lists, flatten it into a
	 * single list. Example: Nested Lists: [[1, 2], [3, 4], [5, 6, 7]] Output: [1,
	 * 2, 3, 4, 5, 6, 7] Explanation: flatMap() flattens all nested lists into one
	 * single list.
	 */
	public List<Integer> flattenList(List<List<Integer>> nestedLists) {
		// write code here using Java Streams API
		return null;
	}

	/**
	 * 14. Find Average of Numbers Example: Given a list of integers, calculate the
	 * average. Example: Numbers: [10, 20, 30, 40, 50] Output: 30.0 Explanation: (10
	 * + 20 + 30 + 40 + 50) / 5 = 30.0
	 */
	public double calculateAverage(List<Integer> numbers) {
		// write code here using Java Streams API
		return -1;
	}

	/**
	 * 15. Partition List into Even and Odd Numbers Example: Given a list of
	 * integers, partition them into even and odd. Example: Numbers: [1, 2, 3, 4, 5,
	 * 6] Output: {false=[1, 3, 5], true=[2, 4, 6]} Explanation: partitioningBy()
	 * groups numbers by the predicate (even = true, odd = false).
	 */
	public Map<Boolean, List<Integer>> partitionEvenOdd(List<Integer> numbers) {
		// write code here using Java Streams API
		return null;
	}

	/**
	 * 16. Find Second Smallest Number Example: Given a list of integers, find the
	 * second smallest number. Example: Numbers: [10, 5, 20, 8, 15, 3] Output: 5
	 * Explanation: After sorting: [3, 5, 8, 10, 15, 20], the second element is 5.
	 */
	public Integer findSecondSmallest(List<Integer> numbers) {
		// write code here using Java Streams API
		return null;
	}

	/**
	 * 17. Convert String Array to Map with Length Example: Given a list of strings,
	 * create a map with string as key and its length as value. Example: Strings:
	 * ["apple", "banana", "kiwi"] Output: {apple=5, banana=6, kiwi=4} Explanation:
	 * Each string is mapped to its length using toMap() collector.
	 */
	public Map<String, Integer> stringToLengthMap(List<String> strings) {
		// write code here using Java Streams API
		return null;
	}

	/**
	 * 18. Limit Stream to First N Elements Example: Given a list of integers,
	 * return only the first 3 elements. Example: Numbers: [10, 20, 30, 40, 50, 60]
	 * Output: [10, 20, 30] Explanation: limit(3) restricts the stream to first 3
	 * elements.
	 */
	public List<Integer> getFirstN(List<Integer> numbers, int n) {
		// write code here using Java Streams API
		return null;
	}

	/**
	 * 19. Check if List Contains a Specific Element Example: Given a list of
	 * strings, check if it contains "Java". Example: Strings: ["Python", "Java",
	 * "C++", "JavaScript"] Output: true Explanation: anyMatch() returns true if at
	 * least one element matches the condition.
	 */
	public boolean containsElement(List<String> strings, String element) {
		// write code here using Java Streams API
		return false;
	}

	/**
	 * 20. Group Strings by Their First Character Example: Given a list of strings,
	 * group them by their first character. Example: Strings: ["apple", "banana",
	 * "apricot", "cherry", "avocado"] Output: {a=[apple, apricot, avocado],
	 * b=[banana], c=[cherry]} Explanation: groupingBy() groups strings based on
	 * their first character.
	 */
	public Map<Character, List<String>> groupByFirstChar(List<String> strings) {
		// write code here using Java Streams API
		return null;
	}

	/**
	 * 21. Filter Employees by Department Example: Given a list of employees, filter
	 * all employees from the "IT" department. Example: Employees: [
	 * Employee("Alice", "HR", 60000), Employee("Bob", "IT", 80000),
	 * Employee("Charlie", "HR", 70000), Employee("David", "IT", 90000) ] Output:
	 * [Employee("Bob", "IT", 80000), Employee("David", "IT", 90000)] Explanation:
	 * Only employees from IT department are returned.
	 */
	public List<Employee> filterByDepartment(List<Employee> employees, String department) {
		// write code here using Java Streams API
		return null;
	}

}
