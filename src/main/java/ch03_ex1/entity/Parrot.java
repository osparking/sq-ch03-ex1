package ch03_ex1.entity;

import lombok.Data;

@Data
public class Parrot {
	private String name;

	@Override
	public String toString() {
		return "앵무새: " + name;
	}
	
}
