package org.projects.assignments.l3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.projects.assignments.models.Employee;

public class L3AssignmentTest {
	L3Assignment l3Assignment = new L3Assignment();

	@Test
	public void testAverageSalaryByDepartment() {

		List<Employee> employees = List.of(new Employee("Alice", "HR", 60000.0), new Employee("Bob", "IT", 80000.0),
				new Employee("Charlie", "HR", 70000.0), new Employee("David", "IT", 90000.0));
		Map<String, Double> expected = Map.of("HR", 65000.0, "IT", 85000.0);
		Map<String, Double> result = l3Assignment.averageSalaryByDepartment(employees);
		assertEquals(expected, result);
	}

	@Test
	public void testSecondHighestUniqueSalary() {
		List<Integer> salaries = List.of(50000, 60000, 70000, 60000, 80000);
		int expected = 70000;
		int result = l3Assignment.secondHighestUniqueSalary(salaries);
		assertEquals(expected, result);
	}

	@Test
	public void testSecondHighestUniqueSalaryNoSecond() {
		List<Integer> salaries = List.of(50000, 50000, 50000);
		int expected = -1;
		int result = l3Assignment.secondHighestUniqueSalary(salaries);
		assertEquals(expected, result);
	}

	@Test
	public void testStringLengthMap() {
		List<String> strings = List.of("apple", "banana", "cherry");
		Map<String, Integer> expected = Map.of("apple", 5, "banana", 6, "cherry", 6);
		Map<String, Integer> result = l3Assignment.stringLengthMap(strings);
		assertEquals(expected, result);
	}

	@Test
	public void testcommonElements() {
		List<Integer> list1 = List.of(1, 2, 3, 4, 5);
		List<Integer> list2 = List.of(4, 5, 6, 7, 8);
		List<Integer> expected = List.of(4, 5);
		List<Integer> result = l3Assignment.commonElements(list1, list2);
		assertEquals(expected, result);
	}

	@Test
	public void testpartitionEvenOdd() {
		List<Integer> input = List.of(1, 2, 3, 4, 5, 6);
		Map<Boolean, List<Integer>> expected = Map.of(true, List.of(2, 4, 6), false, List.of(1, 3, 5));
		Map<Boolean, List<Integer>> result = l3Assignment.partitionEvenOdd(input);
		assertEquals(expected, result);
	}

	@Test
	public void testTopNFrequentElements() {
		List<String> input = List.of("apple", "banana", "apple", "orange", "banana", "apple", "kiwi", "kiwi", "kiwi",
				"kiwi", "banana", "banana", "banana", "pineapple", "pineapple", "pineapple", "pineapple", "pineapple",
				"pineapple", "grape", "grape", "grape", "grape", "grape", "grape", "grape");
		int n = 2;
		List<String> expected = List.of("banana", "pineapple");
		List<String> result = l3Assignment.topNFrequentElements(input, n);
		assertEquals(expected, result);
	}

	@Test
	public void testflattenListOfLists() {
		List<List<Integer>> input = List.of(List.of(1, 2, 3), List.of(4, 5), List.of(6, 7, 8, 9));
		List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> result = l3Assignment.flattenListOfLists(input);
		assertEquals(expected, result);
	}

	@Test
	public void testCumulativeSum() {
		List<Integer> input = List.of(1, 2, 3, 4, 5);
		List<Integer> expected = List.of(1, 3, 6, 10, 15);
		List<Integer> result = l3Assignment.cumulativeSum(input);
		assertEquals(expected, result);
	}

	@Test
	public void testCumulativeSum2() {
		List<Integer> input = List.of(10, -2, 3, 1);
		List<Integer> expected = List.of(10, 8, 11, 12);
		List<Integer> result = l3Assignment.cumulativeSum(input);
		assertEquals(expected, result);
	}

	@Test
	public void testdepartmentWithHighestAverageSalary() {
		List<Employee> employees = List.of(new Employee("Alice", "HR", 60000.0), new Employee("Bob", "IT", 80000.0),
				new Employee("Charlie", "HR", 70000.0), new Employee("David", "IT", 90000.0),
				new Employee("Eve", "Finance", 95000.0));
		String expected = "Finance";
		String result = l3Assignment.departmentWithHighestAverageSalary(employees);
		assertEquals(expected, result);
	}

	@Test
	public void testdepartmentWithHighestAverageSalary_2() {
		List<Employee> employees = List.of(new Employee("Alice", "HR", 60000.0), new Employee("Bob", "IT", 80000.0),
				new Employee("Charlie", "HR", 70000.0), new Employee("David", "IT", 90000.0),
				new Employee("Eve", "IT", 85000.0), new Employee("Frank", "Finance", 75000.0),
				new Employee("Grace", "Finance", 70000.0), new Employee("Heidi", "Finance", 80000.0),
				new Employee("Ivan", "IT", 95000.0), new Employee("Judy", "HR", 65000.0),
				new Employee("Mallory", "IT", 92000.0), new Employee("Niaj", "Finance", 78000.0),
				new Employee("Olivia", "HR", 72000.0), new Employee("Peggy", "IT", 88000.0),
				new Employee("Sybil", "Finance", 77000.0), new Employee("Trent", "HR", 68000.0),
				new Employee("Victor", "IT", 91000.0));
		String expected = "IT";
		String result = l3Assignment.departmentWithHighestAverageSalary(employees);
		assertEquals(expected, result);
	}

	@Test
	public void testRemoveDuplicateCharacters() {
		String input = "programming";
		String expected = "progamin";
		String result = l3Assignment.removeDuplicateCharacters(input);
		assertEquals(expected, result);
	}

	@Test
	public void testRemoveDuplicateCharacters2() {
		String input = "aabbccddeeff";
		String expected = "abcdef";
		String result = l3Assignment.removeDuplicateCharacters(input);
		assertEquals(expected, result);
	}
}
