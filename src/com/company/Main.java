package com.company;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
//        /qq/./ww/../ee/rr/../../tt => /qq/tt
//        /. - текущая директория
//        /.. - родительская директория

		String path = "/qq/./ww/../ee/rr/../../tt";
		String[] parts = path.split("/");

		Stack<String> stack = new Stack<>();
		for (String part : parts) {
			if (part.equals("..")) {
				stack.pop();
			} else if (part.equals(".")) {
//                ignored
			} else {
				stack.push(part);
			}
		}

		StringBuilder result = new StringBuilder();
		for (String part : stack)
			if (!part.isEmpty())
				result.append("/").append(part);


		System.out.println("result = " + result);
	}
}
