package org.projects.assignments.flatmaps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class TestCookingFlatMaps {

	@Test
	void testFlattenListOfLists() {
		List<List<Integer>> input = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5), Arrays.asList(6));
		List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
		assertEquals(expected, CookingFlatMaps.flattenListOfLists(input));
	}

	@Test
	void testSplitSentencesIntoWords() {
		List<String> input = Arrays.asList("Hello World", "Java Streams");
		List<String> expected = Arrays.asList("Hello", "World", "Java", "Streams");
		assertEquals(expected, CookingFlatMaps.splitSentencesIntoWords(input));
	}

	@Test
	void testExtractCharacters() {
		List<String> input = Arrays.asList("java", "stream");
		List<Character> expected = Arrays.asList('j', 'a', 'v', 's', 't', 'r', 'e', 'm');
		assertEquals(expected, CookingFlatMaps.extractCharacters(input));
	}

	@Test
	void testFlattenOptionals() {
		List<Optional<Integer>> input = Arrays.asList(Optional.of(1), Optional.empty(), Optional.of(3));
		List<Integer> expected = Arrays.asList(1, 3);
		assertEquals(expected, CookingFlatMaps.flattenOptionals(input));
	}

	@Test
	void testExtractEmployeeSkills() {
		List<CookingFlatMaps.Employee> employees = Arrays.asList(
				new CookingFlatMaps.Employee("A", Arrays.asList("Java", "SQL")),
				new CookingFlatMaps.Employee("B", Arrays.asList("Python")));
		List<String> expected = Arrays.asList("Java", "SQL", "Python");
		assertEquals(expected, CookingFlatMaps.extractEmployeeSkills(employees));
	}

	@Test
	void testSplitCommaSeparatedNumbers() {
		List<String> input = Arrays.asList("1,2,3", "4,5");
		List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
		assertEquals(expected, CookingFlatMaps.splitCommaSeparatedNumbers(input));
	}

	@Test
	void testFlattenMapValues() {
		Map<String, List<String>> input = new HashMap<>();
		input.put("A", Arrays.asList("one", "two"));
		input.put("B", Arrays.asList("three"));
		List<String> expected = Arrays.asList("one", "two", "three");
		assertEquals(expected, CookingFlatMaps.flattenMapValues(input));
	}

	@Test
	void testExtractDomains() {
		List<String> input = Arrays.asList("a@gmail.com", "b@yahoo.com");
		List<String> expected = Arrays.asList("gmail.com", "yahoo.com");
		assertEquals(expected, CookingFlatMaps.extractDomains(input));
	}

	@Test
	void testExpandProductVariations() {
		List<CookingFlatMaps.Product> products = Arrays.asList(
				new CookingFlatMaps.Product("Tshirt", Arrays.asList("S", "M")),
				new CookingFlatMaps.Product("Shoes", Arrays.asList("8", "9")));
		List<String> expected = Arrays.asList("Tshirt-S", "Tshirt-M", "Shoes-8", "Shoes-9");
		assertEquals(expected, CookingFlatMaps.expandProductVariations(products));
	}

	@Test
	void testGeneratePairs() {
		List<Integer> list1 = Arrays.asList(1, 2);
		List<Integer> list2 = Arrays.asList(3, 4);
		List<String> expected = Arrays.asList("(1,3)", "(1,4)", "(2,3)", "(2,4)");
		assertEquals(expected, CookingFlatMaps.generatePairs(list1, list2));
	}
}
