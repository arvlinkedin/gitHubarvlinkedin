package org.projects.assignments.l3;


import org.projects.assignments.models.Employee;

import java.util.List;
import java.util.Map;

public class L3Assignment {

     /*
      PROBLEM -- 101
      Given a list of Employee objects, where each Employee has a name, department, and salary,
      write a method that returns a map where the keys are department names and the values are the
      average salary of employees in that department. Use Java Streams API to perform this operation.
        Example:
        Input: List of Employees
        [
            Employee("Alice", "HR", 60000),
            Employee("Bob", "IT", 80000),
            Employee("Charlie", "HR", 70000),
            Employee("David", "IT", 90000)
        ]
        Output:
        {
            "HR": 65000.0,
            "IT": 85000.0
        }
    */

    public Map<String, Double> averageSalaryByDepartment(List<Employee> employees) {
        // write code here using Java Streams API
        return null;
    }

    /*
    PROBLEM -- 102
    From a list of employee salaries, find the second highest unique salary.
    Example:
    Input: [50000, 60000, 70000, 60000, 80000]
    Output: 70000
    Note: If there is no second highest unique salary, return -1.
     */
    public int secondHighestUniqueSalary(List<Integer> salaries) {
        // write code here using Java Streams API
        return -1;
    }

    /*
    PROBLEM -- 103
    Transform a list of strings into a map where the key is the string and the value is its length.
    Example:
    Input: ["apple", "banana", "cherry"]
    Output: {"apple": 5, "banana": 6, "cherry": 6}
     */
    public Map<String, Integer> stringLengthMap(List<String> strings) {
        // write code here using Java Streams API
        return null;
    }

    /*
    PROBLEM -- 104
    Given two lists, find elements that appear in both lists.
    Example:
    Input: List1 = [1, 2, 3, 4], List2 = [3, 4, 5, 6]
    Output: [3, 4]
     */
    public List<Integer> commonElements(List<Integer> list1, List<Integer> list2) {
        // write code here using Java Streams API
        return null;
    }

    /*
    PROBLEM -- 105
    Split a list of integers into even and odd numbers using partitioning.
    Example:
    Input: [1, 2, 3, 4, 5, 6]
    Output: {true: [2, 4, 6], false: [1, 3, 5]}
     */
    public Map<Boolean, List<Integer>> partitionEvenOdd(List<Integer> numbers) {
        // write code here using Java Streams API
        return null;
    }

    /*
    PROBLEM -- 106
    From a list of strings, find the N most frequently occurring elements.
    Example:
    Input: ["apple", "banana", "apple", "orange", "banana", "apple"], N = 2
    Output: ["apple", "banana"]
     */
    public List<String> topNFrequentElements(List<String> strings, int n) {
        // write code here using Java Streams API
        return null;
    }

    /*
    PROBLEM -- 107
    Given a list of lists, flatten it into a single list using flatMap
    Example:
    Input: [[1, 2], [3, 4], [5]]
    Output: [1, 2, 3, 4, 5]
     */
    public List<Integer> flattenListOfLists(List<List<Integer>> listOfLists) {
        // write code here using Java Streams API
        return null;
    }

    /*
    PROBLEM -- 108
    Transform a list of numbers into their cumulative sum.
    Example:
    Input: [1, 2, 3, 4]
    Output: [1, 3, 6, 10]
    Explanation: (1, 1+2, 1+2+3, 1+2+3+4)
     */
    public List<Integer> cumulativeSum(List<Integer> numbers) {
        // write code here using Java Streams API
        return null;
    }

    /*
    PROBLEM -- 109
    From employee data, identify which department has the highest average salary
    Example:
    Input: List of Employees
    [
        Employee("Alice", "HR", 60000),
        Employee("Bob", "IT", 80000),
        Employee("Charlie", "HR", 70000),
        Employee("David", "IT", 90000)
    ]
    Output: "IT"
     */
    public String departmentWithHighestAverageSalary(List<Employee> employees) {
        // write code here using Java Streams API
        return null;
    }

    /*
    PROBLEM -- 110
    Remove duplicate characters from a string while preserving order.
    Example:
    Input: "programming"
    Output: "progamin"
     */
    public String removeDuplicateCharacters(String input) {
        // write code here using Java Streams API
        return null;
    }
}

