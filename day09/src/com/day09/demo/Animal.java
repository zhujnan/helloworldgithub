package com.day09.demo;

import java.util.ArrayList;
import java.util.List;

public class Animal<T> {
	private T name;
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
		}
	public void show() {
		System.out.println("动物");
	}
	/**
	 * 使用<?> 或者<? extends SomeClass>声明方式，
	 * 意味着只能通过该名称来取得所参考实例的信息。
	 * 
	 * <?> 相当于 <? extends Object>
	 * @param args
	 */
	public static void main(String[] args) {
		Animal<? extends List> animals 
			= new Animal<ArrayList>();
	}
}
