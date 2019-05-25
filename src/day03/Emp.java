package day03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 * 
 * 定义构造方法，以及属性get,set方法.
 * 定义toString方法，格式如:
 *    姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2006-02-15
 * 
 * 定义equals方法，要求只要名字相同，则认为内容一致。
 * @author Bonnie
 *
 */
public class Emp {
		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
		public Emp(String name, int age, String gender, int salary, int hiredate) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.hiredate = hiredate;
	}
		public Emp() {
		super();
		
	}
		@Override
	public String toString() {
		return "Emp [名字=" + name + ", 年龄=" + age + ", 性别=" + gender + ", 工资=" + salary + ", 入职时间="
				+ hiredate + "]";
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getHiredate() {
		
		return hiredate;
	}
	public void setHiredate(int hiredate) {
		this.hiredate = hiredate;
		
	}
		private String name;
		private int age;
		private String gender;
		private int salary;
		private int hiredate;
		Date date=new Date();//入职时间
		

	public static void main(String[] args) {
		Emp a=new Emp("张三",25,"男",5000,20190213);
		Emp b=new Emp("李四",26,"男",6000,20190512);
		Emp c=new Emp("张三",29,"男",5600,20180601);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		boolean q=a.equals(b);
		boolean q1=a.equals(c);
		System.out.println(q);
		System.out.println(q1);
	}
}
