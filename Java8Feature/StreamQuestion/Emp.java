package Java8Feature.StreamQuestion;

import java.util.Date;

public class Emp {
	private String name;
	private long sallery;
	private Date joiningDate;
	private String gender;
	public String getName() {
		return name;
	}
	public long getSallery() {
		return sallery;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public String getGender() {
		return gender;
	}
	public Emp(String name, long sallery, Date joiningDate, String gender) {
		this.name = name;
		this.sallery = sallery;
		this.joiningDate = joiningDate;
		this.gender = gender;
	}
	public Emp(String name2, double d, Object joiningDate2, String gender2) {
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", sallery=" + sallery + ", joiningDate=" + joiningDate + ", gender=" + gender
				+ ", getName()=" + getName() + ", getSallery()=" + getSallery() + ", getJoiningDate()="
				+ getJoiningDate() + ", getGender()=" + getGender() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
