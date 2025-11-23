package org.projects.assignments.models;

public record Employee(String name, String department, Double salary) {

	public Employee(String string, String string2, int i) {
		this(string, string2, Double.valueOf(i));
	}
}
