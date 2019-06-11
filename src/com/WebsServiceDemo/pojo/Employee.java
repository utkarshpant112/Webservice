package com.WebsServiceDemo.pojo;

public class Employee {

	private	String id;
	private	String name;
	private	int age;
	private	String email;		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(String id, String name, int age, String email) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.email = email;
		} 
		
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + "]";
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
}
