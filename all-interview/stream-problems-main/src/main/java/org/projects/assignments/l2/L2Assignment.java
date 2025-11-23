package org.projects.assignments.l2;

import org.projects.assignments.models.Employee;

import java.util.List;
import java.util.Map;

public class L2Assignment {
    /*
    1. Find Employees with Nth Highest unique Salary using Java Streams API.
    Example: Employees:
    [
        Employee("Alice", "HR", 60000),
        Employee("Bob", "IT", 80000),
        Employee("Charlie", "HR", 70000),
        Employee("David", "IT", 90000),
        Employee("Eve", "Finance", 80000)
    ]
    N = 3
    Output: 70000
    If there is no Nth highest unique salary, return -1.
     */
    public Double findEmployeesWithNthHighestUniqueSalary(Employee[] employees, int N) {
        // write code here using Java Streams API
        return -1.0;
    }

    /*
    2. Convert List of Objects to Map with Custom Key-Value Pairs using Java Streams API.
    Example: Employees:
    [
        Employee("Alice", "HR", 60000),
        Employee("Bob", "IT", 80000),
        Employee("Charlie", "HR", 70000),
        Employee("David", "IT", 90000),
        Employee("Eve", "Finance", 80000)
    ]
    Output: {   "HR": ["Alice", "Charlie"], "IT": ["Bob", "David"], "Finance": ["Eve"]}
     */
    public Map<String, String> convertListOfObjectsToMap(Employee[] employees) {
        // write code here using Java Streams API
        return null;
    }

    /*
    3. 3. Find All Duplicate Elements in a List using Java Streams API.
    Example:
    Input: [1, 2, 3, 4, 5, 3, 2, 1]
    Output: [1, 2, 3]
     */
    public List<Integer> findAllDuplicateElementsInList(List<Integer> numbers) {
        // write code here using Java Streams API
        return null;
    }

    /*
    4. Group by Multiple Fields using Java Streams API.
    Example: Employees:
    [
        Employee("Alice", "HR", 60000),
        Employee("Bob", "IT", 80000),
        Employee("Charlie", "HR", 70000),
        Employee("David", "IT", 90000),
        Employee("Eve", "Finance", 80000)
        Employee("Frank", "IT", 80000)
    ]
    Output: {
        "HR": {
            60000: ["Alice"],
            70000: ["Charlie"]
        },
        "IT": {
            80000: ["Bob", "Frank"],
            90000: ["David"]
        },
        "Finance": {
            80000: ["Eve"]
        }
    }
    Explanation: The outer map groups employees by their department, and the inner map groups them by their salary within each department.

     */

    public Map<String, Map<Double, List<String>>> groupByMultipleFields(Employee[] employees) {
        // write code here using Java Streams API
        return null;
    }

    /*
    5. Find Longest String in Each Group using Java Streams API.
    Example:
    Input: ["apple", "banana", "pear", "kiwi", "grape", "blueberry"]
    Output: {
        'a': "banana",
        'b': "blueberry",
        'p': "pear",
        'k': "kiwi",
        'g': "grape"
    }
    Explanation: The map groups strings by their starting character and maps to the longest string in each group.
     */
    
    public Map<Character, String> findLongestStringInEachGroup(List<String> words) {
        // write code here using Java Streams API
        return null;
    }

    /*
    6. Calculate Running Average of a Stream of Numbers using Java Streams API.
    Example:
    Input: [10, 20, 30, 40, 50]
    Output: [10.0, 15.0, 20.0, 25.0, 30.0]
    Explanation: The output list contains the running average after each number in the input list.
     */
    public List<Double> calculateRunningAverage(List<Integer> numbers) {
        // write code here using Java Streams API
        return null;
    }

    /*
    7. Count Employees by Department using Java Streams API.
    Example: Employees:
    [
        Employee("Alice", "HR", 60000),
        Employee("Bob", "IT", 80000),
        Employee("Charlie", "HR", 70000),
        Employee("David", "IT", 90000),
        Employee("Eve", "Finance", 80000)
    ]
    Output: {"HR": 2, "IT": 2, "Finance": 1}
    Explanation: The map contains the count of employees in each department.
     */
    public Map<String, Double> countEmployeesByDepartment(List<Employee> employees) {
        // write code here using Java Streams API
        return null;
    }

    /*
    8. Find Elements That Appear Exactly Once in a List using Java Streams API.
    Example:
    Input: [1, 2, 3, 4, 5, 3, 2, 1]
    Output: [4, 5]
    Explanation: The output list contains elements that appear exactly once in the input list.
     */
    public List<Integer> findElementsThatAppearExactlyOnceInList(List<Integer> numbers) {
        // write code here using Java Streams API
        return null;
    }

    /*
    9. Create Hierarchical Map from Flat List using Java Streams API.
    Example: Employees:
    [
        Employee("Alice", "HR", 60000),
        Employee("Bob", "IT", 80000),
        Employee("Charlie", "HR", 70000),
        Employee("David", "IT", 90000),
        Employee("Eve", "Finance", 80000)
    ]
    Output: {
        "HR": {
            "employees": ["Alice", "Charlie"],
            "totalSalary": 130000
        },
        "IT": {
            "employees": ["Bob", "David"],
            "totalSalary": 170000
        },
        "Finance": {
            "employees": ["Eve"],
            "totalSalary": 80000
        }
     */
    public Map<String, Map<String, List<Employee>>> createHierarchicalMapFromFlatList(Employee[] employees)  {
        // write code here using Java Streams API
        return null;
    }

    /*
    10. Find Top N Employees by Salary in Each Department using Java Streams API.
    Example: Employees:
    [
        Employee("Alice", "HR", 60000),
        Employee("Bob", "IT", 80000),
        Employee("Charlie", "HR", 70000),
        Employee("David", "IT", 90000),
        Employee("Eve", "Finance", 80000),
        Employee("Frank", "IT", 85000)
    ]
    N = 2
    Output: {
        "HR": ["Charlie", "Alice"],
        "IT": ["David", "Frank"],
        "Finance": ["Eve"]
    }
    Explanation: The map contains the top N employees by salary in each department. If a department has fewer than N employees, include all of them.
     */
    public Map<String, List<String>> findTopNEmployeesBySalaryInEachDepartment(List<Employee> employees, int N) {
        // write code here using Java Streams API
        return null;
    }
}
