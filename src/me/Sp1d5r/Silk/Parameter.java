package me.Sp1d5r.Silk;

import me.Sp1d5r.Silk.Type;

public class Parameter {

	private String name;
	private Type type;
	
	public Parameter(Type type, String name) {
		this.type = type;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Type getType() {
		return type;
	}
}