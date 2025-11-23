package org.projects.assignments.l2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.projects.assignments.models.Employee;
import org.projects.assignments.models.EmployeeCustomView;

public class L2AssignmentTest {
	L2Assignment l2Assignment = new L2Assignment();

	/*
	 * Tests for findEmployeesWithNthHighestUniqueSalary
	 */
	@Test
	public void testFindEmployeesWithNthHighestUniqueSalary() {
		Employee[] employees = { new Employee("Alice", "HR", 60000.0), new Employee("Bob", "IT", 80000.0),
				new Employee("Charlie", "HR", 70000.0), new Employee("David", "IT", 90000.0),
				new Employee("Eve", "Finance", 80000.0) };
		Double expected = 70000.0; // 3rd highest unique salary
		Double result = l2Assignment.findEmployeesWithNthHighestUniqueSalary(employees, 3);
		assertEquals(expected, result);
	}

	@Test
	public void testFindEmployeesWithNthHighestUniqueSalaryNoThird() {
		Employee[] employees = { new Employee("Alice", "HR", 60000.0), new Employee("Bob", "IT", 80000.0),
				new Employee("Charlie", "HR", 70000.0), new Employee("David", "IT", 90000.0),
				new Employee("Eve", "Finance", 80000.0) };
		Double expected = -1.0; // No 4th highest unique salary
		Double result = l2Assignment.findEmployeesWithNthHighestUniqueSalary(employees, 5);
		assertEquals(expected, result);
	}

	@Test
	public void testFindEmployeesWithNthHighestUniqueSalarySingleEmployee() {
		Employee[] employees = { new Employee("Alice", "HR", 60000.0) };
		Double expected = -1.0; // No 2nd highest unique salary
		Double result = l2Assignment.findEmployeesWithNthHighestUniqueSalary(employees, 2);
		assertEquals(expected, result);
	}

	@Test
	public void testFindEmployeesWithNthHighestUniqueSalaryAllSameSalary() {
		Employee[] employees = { new Employee("Alice", "HR", 60000.0), new Employee("Bob", "IT", 60000.0),
				new Employee("Charlie", "HR", 60000.0) };
		Double expected = -1.0; // No 2nd highest unique salary
		Double result = l2Assignment.findEmployeesWithNthHighestUniqueSalary(employees, 2);
		assertEquals(expected, result);
	}

	@Test
	public void testFindEmployeesWithNthHighestUniqueSalaryNegativeSalaries() {
		Employee[] employees = { new Employee("Alice", "HR", -60000.0), new Employee("Bob", "IT", -80000.0),
				new Employee("Charlie", "HR", -70000.0) };
		Double expected = -70000.0; // 2nd highest unique salary
		Double result = l2Assignment.findEmployeesWithNthHighestUniqueSalary(employees, 2);
		assertEquals(expected, result);
	}

	/*
	 * Tests for convertListOfObjectsToMap
	 */
	@Test
	public void testConvertListOfObjectsToMap() {
		Employee[] employees = { new Employee("Alice", "HR", 60000.0), new Employee("Bob", "IT", 80000.0),
				new Employee("Charlie", "HR", 70000.0), new Employee("David", "IT", 90000.0),
				new Employee("Eve", "Finance", 80000.0) };
		Map<String, List<String>> expected = Map.of("HR", List.of("Alice", "Charlie"), "IT", List.of("Bob", "David"),
				"Finance", List.of("Eve"));
		;
		Map<String, List<String>> result = l2Assignment.convertListOfObjectsToMap(employees);
		assertEquals(expected, result);
	}

	@Test
	public void testConvertListOfObjectsToMapSingleEmployee() {
		Employee[] employees = { new Employee("Alice", "HR", 60000.0) };
		String expected = "{HR=[Alice]}";
		String result = l2Assignment.convertListOfObjectsToMap(employees).toString();
		assertEquals(expected, result);
	}

	/*
	 * Tests for findAllDuplicateElementsInList
	 */
	@Test
	public void testFindAllDuplicateElementsInList() {
		List<Integer> input = List.of(1, 2, 3, 4, 5, 3, 2, 1);
		List<Integer> expected = List.of(1, 2, 3);
		List<Integer> result = l2Assignment.findAllDuplicateElementsInList(input);
		assertEquals(expected, result);

	}

	@Test
	public void testFindAllDuplicateElementsInListNoDuplicates() {
		List<Integer> input = List.of(1, 2, 3, 4, 5);
		List<Integer> expected = List.of();
		List<Integer> result = l2Assignment.findAllDuplicateElementsInList(input);
		assertEquals(expected, result);
	}

	@Test
	public void testFindAllDuplicateElementsInListAllDuplicates() {
		List<Integer> input = List.of(1, 1, 1, 1);
		List<Integer> expected = List.of(1);
		List<Integer> result = l2Assignment.findAllDuplicateElementsInList(input);
		assertEquals(expected, result);
	}

	/*
	 * Tests for groupByMultipleFields
	 */

	@Test
	public void testGroupByMultipleFields() {
		Employee[] employees = { new Employee("Alice", "HR", 60000.0), new Employee("Bob", "IT", 80000.0),
				new Employee("Charlie", "HR", 70000.0), new Employee("David", "IT", 90000.0),
				new Employee("Eve", "Finance", 80000.0), new Employee("Frank", "IT", 80000.0) };
		Map<String, Map<Double, List<String>>> expected =

				Map.of(//
						"HR", Map.of(//
								60000.0, List.of("Alice")//
								, 70000.0, List.of("Charlie")//

						), "IT", Map.of(//
								80000.0, List.of("Bob", "Frank")//
								, 90000.0, List.of("David")//
						), "Finance", Map.of(//
								80000.0, List.of("Eve")//
						));
		Map<String, Map<Double, List<String>>> result = l2Assignment.groupByMultipleFields(employees);
		assertEquals(expected, result);
	}

	@Test
	public void testGroupByMultipleFieldsSingleEmployee() {
		Employee[] employees = { new Employee("Alice", "HR", 60000.0) };
		Map<String, Map<Double, List<String>>> expected = Map.of(//
				"HR", Map.of(//
						60000.0, List.of("Alice")//
				));
		Map<String, Map<Double, List<String>>> result = l2Assignment.groupByMultipleFields(employees);
		assertEquals(expected, result);
	}

	/*
	 * Tests for findLongestStringInEachGroup
	 */

	@Test
	public void testFindLongestStringInEachGroup() {
		List<String> input = List.of("apple", "banana", "pear", "kiwi", "grapefruit", "blueberry");
		Map<Character, String> expected = Map.of('a', "apple", 'b', "blueberry", 'g', "grapefruit", 'k', "kiwi", 'p',
				"pear");
		Map<Character, String> result = l2Assignment.findLongestStringInEachGroup(input);
		assertEquals(expected, result);
	}

	@Test
	public void testFindLongestStringInEachGroupSingleCharacter() {
		List<String> input = List.of("a", "b", "c", "d");
		Map<Character, String> expected = Map.of('a', "a", 'b', "b", 'c', "c", 'd', "d");
		Map<Character, String> result = l2Assignment.findLongestStringInEachGroup(input);
		assertEquals(expected, result);
	}

	/*
	 * Tests for calculateRunningAverage
	 */
	@Test
	public void testCalculateRunningAverage() {
		List<Integer> input = List.of(10, 20, 30, 40, 50);
		List<Double> expected = List.of(10.0, 15.0, 20.0, 25.0, 30.0);
		List<Double> result = l2Assignment.calculateRunningAverage(input);
		assertEquals(expected, result);
	}

	@Test
	public void testCalculateRunningAverageSingleElement() {
		List<Integer> input = List.of(10);
		List<Double> expected = List.of(10.0);
		List<Double> result = l2Assignment.calculateRunningAverage(input);
		assertEquals(expected, result);
	}

	@Test
	public void testCalculateRunningAverageEmptyList() {
		List<Integer> input = List.of();
		List<Double> expected = List.of();
		List<Double> result = l2Assignment.calculateRunningAverage(input);
		assertEquals(expected, result);
	}

	/*
	 * Tests for countEmployeesByDepartment
	 */
	@Test
	public void testCountEmployeesByDepartment() {
		List<Employee> employees = List.of(new Employee("Alice", "HR", 60000.0), new Employee("Bob", "IT", 80000.0),
				new Employee("Charlie", "HR", 70000.0), new Employee("David", "IT", 90000.0),
				new Employee("Eve", "Finance", 80000.0));
		Map<String, Double> expected = Map.of("HR", 2.0, "IT", 2.0, "Finance", 1.0);
		Map<String, Double> result = l2Assignment.countEmployeesByDepartment(employees);
		assertEquals(expected, result);
	}

	@Test
	public void testCountEmployeesByDepartmentSingleEmployee() {
		List<Employee> employees = List.of(new Employee("Alice", "HR", 60000.0));
		Map<String, Double> expected = Map.of("HR", 1.0);
		Map<String, Double> result = l2Assignment.countEmployeesByDepartment(employees);
		assertEquals(expected, result);
	}

	/*
	 * Tests for findElementsThatAppearExactlyOnceInList
	 */
	@Test
	public void testFindElementsThatAppearExactlyOnceInList() {
		List<Integer> input = List.of(1, 2, 3, 4, 5, 3, 2, 1);
		List<Integer> expected = List.of(4, 5);
		List<Integer> result = l2Assignment.findElementsThatAppearExactlyOnceInList(input);
		assertEquals(expected, result);
	}

	@Test
	public void testFindElementsThatAppearExactlyOnceInListNoUnique() {
		List<Integer> input = List.of(1, 1, 2, 2, 3, 3);
		List<Integer> expected = List.of();
		List<Integer> result = l2Assignment.findElementsThatAppearExactlyOnceInList(input);
		assertEquals(expected, result);
	}

	/*
	 * Tests for createHierarchicalMapFromFlatList
	 */
	@Test
	public void testCreateHierarchicalMapFromFlatList_BasicCase() {
		Employee[] employees = { new Employee("Alice", "HR", 60000), new Employee("Bob", "IT", 80000),
				new Employee("Charlie", "HR", 70000), new Employee("David", "IT", 90000),
				new Employee("Eve", "Finance", 80000) };

		Map<String, EmployeeCustomView> result = l2Assignment.createHierarchicalMapFromFlatList(employees);

		assertEquals(3, result.size());

		assertTrue(result.containsKey("HR"));
		assertEquals(Arrays.asList("Alice", "Charlie"), result.get("HR").empNameList());
		assertEquals(130000, result.get("HR").totalSalary());

		assertTrue(result.containsKey("IT"));
		assertEquals(Arrays.asList("Bob", "David"), result.get("IT").empNameList());
		assertEquals(170000, result.get("IT").totalSalary());

		assertTrue(result.containsKey("Finance"));
		assertEquals(Collections.singletonList("Eve"), result.get("Finance").empNameList());
		assertEquals(80000, result.get("Finance").totalSalary());
	}

	@Test
	public void testCreateHierarchicalMapFromFlatList_EmptyArray() {
		Employee[] employees = new Employee[0];

		Map<String, EmployeeCustomView> result = l2Assignment.createHierarchicalMapFromFlatList(employees);

		assertTrue(result.isEmpty());
	}

	@Test
	public void testCreateHierarchicalMapFromFlatList_SingleEmployee() {
		Employee[] employees = { new Employee("John", "Marketing", 50000) };

		Map<String, EmployeeCustomView> result = l2Assignment.createHierarchicalMapFromFlatList(employees);

		assertEquals(1, result.size());
		assertTrue(result.containsKey("Marketing"));
		assertEquals(Collections.singletonList("John"), result.get("Marketing").empNameList());
		assertEquals(50000, result.get("Marketing").totalSalary());
	}

	@Test
	public void testCreateHierarchicalMapFromFlatList_MultipleEmployeesSameDepartment() {
		Employee[] employees = { new Employee("Anna", "Sales", 40000), new Employee("Ben", "Sales", 60000),
				new Employee("Cathy", "Sales", 50000) };

		Map<String, EmployeeCustomView> result = l2Assignment.createHierarchicalMapFromFlatList(employees);

		assertEquals(1, result.size());
		assertTrue(result.containsKey("Sales"));
		assertEquals(Arrays.asList("Anna", "Ben", "Cathy"), result.get("Sales").empNameList());
		assertEquals(150000, result.get("Sales").totalSalary());
	}

	/*
	 * Tests for findTopNEmployeesBySalaryInEachDepartment
	 */
	@Test
	public void testFindTopNEmployeesBySalaryInEachDepartment() {
		int N = 2;
		Employee[] employees = { new Employee("Alice", "HR", 60000.0), new Employee("Bob", "IT", 80000.0),
				new Employee("Charlie", "HR", 70000.0), new Employee("David", "IT", 90000.0),
				new Employee("Eve", "Finance", 80000.0), new Employee("Frank", "IT", 85000.0) };
		Map<String, List<String>> expected = Map.of("HR", List.of("Charlie", "Alice"), "IT", List.of("David", "Frank"),
				"Finance", List.of("Eve"));
		Map<String, List<String>> result = l2Assignment.findTopNEmployeesBySalaryInEachDepartment(List.of(employees),
				N);
		assertEquals(expected, result);
	}

	@Test
	public void testFindTopNEmployeesBySalaryInEachDepartmentSingleEmployee() {
		int N = 2;
		List<Employee> employees = List.of(new Employee("Alice", "HR", 60000.0));
		Map<String, List<String>> expected = Map.of("HR", List.of("Alice"));
		Map<String, List<String>> result = l2Assignment.findTopNEmployeesBySalaryInEachDepartment(employees, N);
		assertEquals(expected, result);
	}

}
