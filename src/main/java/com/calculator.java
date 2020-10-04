package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculator {
	int a = 80, b = 40;

	@GetMapping("/add")
	public int add() {
		return a + b;
	}

	@GetMapping("/subtract")
	public int subtract() {
		return a - b;
	}

	@GetMapping("/multiple")
	public int multiple() {
		return a * b;
	}

	@GetMapping("/division")
	public int division() {
		if (b != 0) {
			return a + b;
		} else {
			return 0;
		}
	}

	@GetMapping("/modularDivision")
	public int modularDivision() {
		return a % b;
	}

}
