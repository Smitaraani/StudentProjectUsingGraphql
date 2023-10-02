package com.graphql.example.Graphql.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

		private int stdRoll;

		private String name;

		private String gender;
		
		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "std_id")

		private  StdClass stdclass;

		@ManyToOne
		@JoinColumn(name = "adr_id")

		private Adress adress ;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getStdRoll() {
			return stdRoll;
		}

		public void setStdRoll(int stdRoll) {
			this.stdRoll = stdRoll;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public StdClass getStdclass() {
			return stdclass;
		}

		public void setStdclass(StdClass stdclass) {
			this.stdclass = stdclass;
		}

		public Adress getAdress() {
			return adress;
		}

		public void setAdress(Adress adress) {
			this.adress = adress;
		}

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Student(int id, int stdRoll, String name, String gender,
				com.graphql.example.Graphql.entity.StdClass stdclass,
				com.graphql.example.Graphql.entity.Adress adress) {
			super();
			this.id = id;
			this.stdRoll = stdRoll;
			this.name = name;
			this.gender = gender;
			this.stdclass = stdclass;
			this.adress = adress;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", stdRoll=" + stdRoll + ", name=" + name + ", gender=" + gender
					+ ", stdclass=" + stdclass + ", adress=" + adress + "]";
		}

		
		
}
