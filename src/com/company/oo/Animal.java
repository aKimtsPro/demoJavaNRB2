package com.company.oo;

public class Animal {

	private String nom;
	private int age;
	
	private Animal(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", age=" + age + "]";
	}

	public static Animal.Builder builder(){
		return new Animal.Builder();
	}
	
	
	public static class Builder {
		
		private String nom;
		private int age;
		
		public Animal.Builder nom(String nom){
			this.nom = nom;
			return this;
		}
		
		public Animal.Builder age(int age){
			this.age = age;
			return this;
		}
		
		public Animal build() {
			return new Animal(nom, age);
		}
		
	}
	
	
	
}
