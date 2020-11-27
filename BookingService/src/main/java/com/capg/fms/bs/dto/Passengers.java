package com.capg.fms.bs.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity

public class Passengers {

	@Id
	@Column(name = "passenger_uid")

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "retailerRaw_seq")
	@SequenceGenerator(name = "retailerRaw_seq", sequenceName = "PASSENGER_S1", allocationSize = 1)

	long uid;
	@Column(name = "passenger_name", length = 25)
	String name;
	@Column(name = "passenger_age", length = 3)
	int age;
	@Column(name = "passenger_gender")
	char gender;
	@Column(name = "passenger_phone", length = 10)
	long phone;

	public Passengers() {
	}

	public Passengers(long uid, String name, int age, char gender, long phone) {
		this.uid = uid;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone; /*
							 * this.booking = booking; this.seat = seat;
							 */
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}
