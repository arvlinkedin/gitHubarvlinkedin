package org.projects.assignments.l1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.projects.assignments.models.Employee;

class L1AssignmentTest {

	L1Assignment l1Assignment = new L1Assignment();

	// Test for Question 1: Sum of All Numbers
	@Test
	public void testSumOfNumbers() {
		List<Integer> input = List.of(1, 2, 3, 4, 5);
		int expected = 15;
		int result = l1Assignment.sumOfNumbers(input);
		assertEquals(expected, result);
	}

	// Test for Question 2: Find Maximum Number
	@Test
	public void testFindMaxNumber() {
		List<Integer> input = List.of(10, 5, 20, 8, 15);
		int expected = 20;
		int result = l1Assignment.findMaxNumber(input);
		assertEquals(expected, result);
	}

	// Test for Question 3: Filter Even Numbers
	@Test
	public void testFilterEvenNumbers() {
		List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8);
		List<Integer> expected = List.of(2, 4, 6, 8);
		List<Integer> result = l1Assignment.filterEvenNumbers(input);
		assertEquals(expected, result);
	}

	// Test for Question 4: Convert to Uppercase
	@Test
	public void testConvertToUppercase() {
		List<String> input = List.of("apple", "banana", "cherry");
		List<String> expected = List.of("APPLE", "BANANA", "CHERRY");
		List<String> result = l1Assignment.convertToUppercase(input);
		assertEquals(expected, result);
	}

	// Test for Question 5: Remove Duplicates
	@Test
	public void testRemoveDuplicates() {
		List<Integer> input = List.of(1, 2, 2, 3, 4, 4, 5);
		List<Integer> expected = List.of(1, 2, 3, 4, 5);
		List<Integer> result = l1Assignment.removeDuplicates(input);
		assertEquals(expected, result);
	}

	// Test for Question 6: Check if All Positive
	@Test
	public void testAreAllPositive() {
		List<Integer> input = List.of(1, 2, 3, 4, 5);
		boolean expected = true;
		boolean result = l1Assignment.areAllPositive(input);
		assertEquals(expected, result);
	}

	@Test
	public void testAreAllPositiveWithNegative() {
		List<Integer> input = List.of(1, -2, 3, 4, 5);
		boolean expected = false;
		boolean result = l1Assignment.areAllPositive(input);
		assertEquals(expected, result);
	}

	// Test for Question 7: Count Strings Starting With
	@Test
	public void testCountStringsStartingWith() {
		List<String> input = List.of("Apple", "Banana", "Apricot", "Cherry", "Avocado");
		long expected = 3;
		long result = l1Assignment.countStringsStartingWith(input, 'A');
		assertEquals(expected, result);
	}

	// Test for Question 8: Square Numbers
	@Test
	public void testSquareNumbers() {
		List<Integer> input = List.of(1, 2, 3, 4, 5);
		List<Integer> expected = List.of(1, 4, 9, 16, 25);
		List<Integer> result = l1Assignment.squareNumbers(input);
		assertEquals(expected, result);
	}

	// Test for Question 9: Skip First N Elements
	@Test
	public void testSkipFirstN() {
		List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8);
		List<Integer> expected = List.of(4, 5, 6, 7, 8);
		List<Integer> result = l1Assignment.skipFirstN(input, 3);
		assertEquals(expected, result);
	}

	// Test for Question 10: Join Strings
	@Test
	public void testJoinStrings() {
		List<String> input = List.of("Java", "Python", "JavaScript", "C++");
		String expected = "Java, Python, JavaScript, C++";
		String result = l1Assignment.joinStrings(input, ", ");
		assertEquals(expected, result);
	}

	// Test for Question 11: Find First Greater Than
	@Test
	public void testFindFirstGreaterThan() {
		List<Integer> input = List.of(5, 8, 12, 3, 15, 7);
		Integer expected = 12;
		Integer result = l1Assignment.findFirstGreaterThan(input, 10);
		assertEquals(expected, result);
	}

	// Test for Question 12: Sort By Length
	@Test
	public void testSortByLength() {
		List<String> input = List.of("apple", "kiwi", "banana", "pear");
		List<String> expected = List.of("kiwi", "pear", "apple", "banana");
		List<String> result = l1Assignment.sortByLength(input);
		assertEquals(expected, result);
	}

	// Test for Question 13: Flatten List
	@Test
	public void testFlattenList() {
		List<List<Integer>> input = List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6, 7));
		List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7);
		List<Integer> result = l1Assignment.flattenList(input);
		assertEquals(expected, result);
	}

	// Test for Question 14: Calculate Average
	@Test
	public void testCalculateAverage() {
		List<Integer> input = List.of(10, 20, 30, 40, 50);
		double expected = 30.0;
		double result = l1Assignment.calculateAverage(input);
		assertEquals(expected, result, 0.01);
	}

	// Test for Question 15: Partition Even Odd
	@Test
	public void testPartitionEvenOdd() {
		List<Integer> input = List.of(1, 2, 3, 4, 5, 6);
		Map<Boolean, List<Integer>> expected = Map.of(false, List.of(1, 3, 5), true, List.of(2, 4, 6));
		Map<Boolean, List<Integer>> result = l1Assignment.partitionEvenOdd(input);
		assertEquals(expected, result);
	}

	// Test for Question 16: Find Second Smallest
	@Test
	public void testFindSecondSmallest() {
		List<Integer> input = List.of(10, 5, 20, 8, 15, 3);
		Integer expected = 5;
		Integer result = l1Assignment.findSecondSmallest(input);
		assertEquals(expected, result);
	}

	// Test for Question 17: String to Length Map
	@Test
	public void testStringToLengthMap() {
		List<String> input = List.of("apple", "banana", "kiwi");
		Map<String, Integer> expected = Map.of("apple", 5, "banana", 6, "kiwi", 4);
		Map<String, Integer> result = l1Assignment.stringToLengthMap(input);
		assertEquals(expected, result);
	}

	// Test for Question 18: Get First N Elements
	@Test
	public void testGetFirstN() {
		List<Integer> input = List.of(10, 20, 30, 40, 50, 60);
		List<Integer> expected = List.of(10, 20, 30);
		List<Integer> result = l1Assignment.getFirstN(input, 3);
		assertEquals(expected, result);
	}

	// Test for Question 19: Contains Element
	@Test
	public void testContainsElement() {
		List<String> input = List.of("Python", "Java", "C++", "JavaScript");
		boolean expected = true;
		boolean result = l1Assignment.containsElement(input, "Java");
		assertEquals(expected, result);
	}

	@Test
	public void testDoesNotContainElement() {
		List<String> input = List.of("Python", "Java", "C++", "JavaScript");
		boolean expected = false;
		boolean result = l1Assignment.containsElement(input, "Ruby");
		assertEquals(expected, result);
	}

	// Test for Question 20: Group By First Char
	@Test
	public void testGroupByFirstChar() {
		List<String> input = List.of("apple", "banana", "apricot", "cherry", "avocado");
		Map<Character, List<String>> expected = Map.of('a', List.of("apple", "apricot", "avocado"), 'b',
				List.of("banana"), 'c', List.of("cherry"));
		Map<Character, List<String>> result = l1Assignment.groupByFirstChar(input);
		assertEquals(expected, result);
	}

	// Test for Question 20: Group By First Char
	@Test
	public void testfilterByDepartment() {

		List<Employee> employees = List.of(new Employee("Alice", "HR", 60000.0), new Employee("Bob", "IT", 60000.0),
				new Employee("Charlie", "HR", 60000.0), new Employee("Dave", "IT", 60000.0));
		List<Employee> result = l1Assignment.filterByDepartment(employees, "IT");

		assertEquals(List.of(new Employee("Bob", "IT", 60000.0), //
				new Employee("Dave", "IT", 60000.0)), //
				result);
	}
}
