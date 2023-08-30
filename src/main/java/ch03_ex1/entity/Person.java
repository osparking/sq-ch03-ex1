package ch03_ex1.entity;

import lombok.Data;

@Data
public class Person {
	private String name;
	private Parrot parrot;

	@Override
	public String toString() {
		var sb = new StringBuffer("사람: ");
		sb.append(name);
		sb.append("\n");
		sb.append("애완동물: ");
		sb.append(parrot.toString());
		
		return sb.toString();
	}
}
