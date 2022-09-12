package com.te.phonetask;

public class Phone {
String name;
long phonenum;


public Phone() {
}


public Phone(String name, long phonenum) {
	super();
	this.name = name;
	this.phonenum = phonenum;
}


@Override
public String toString() {
	return "Phone [name=" + name + ", phonenum=" + phonenum + "]";
}



}
