package ch03_ex1.entity;

import lombok.Data;

@Data
public class Parrot {
	private String name;
	
	public Parrot() {
		System.out.println("one parrot created");
	}

	@Override
	public String toString() {
		return "앵무새: " + name;
	}
	
}
