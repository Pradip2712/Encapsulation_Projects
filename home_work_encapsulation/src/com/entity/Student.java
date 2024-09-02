package com.entity;

//entity class 
//it is also POJO class
public class Student {
	private int roll;
	private String name;
	private long mob;
	private String add;

	public Student() {

	}

	public Student(int roll, String name, long mob, String add) {
		super();
		this.roll = roll;
		this.name = name;
		this.mob = mob;
		this.add = add;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", mob=" + mob + ", add=" + add + "]";
	}

}
