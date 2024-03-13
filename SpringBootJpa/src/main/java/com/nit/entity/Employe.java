	package com.nit.entity;

	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.SequenceGenerator;
	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;
	import lombok.NonNull;
	import lombok.RequiredArgsConstructor;

	@Entity
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@RequiredArgsConstructor
	public class Employe {
		@Id
		@SequenceGenerator(name = "gen",initialValue = 1,allocationSize = 100)
		@GeneratedValue(generator = "gen",strategy = GenerationType.SEQUENCE)
		@Column(name="emp_id")
		private Integer id;
		@Column(name="emp_name",length = 25)
		@NonNull
		private String name;
		@Column(name="emp_adds",length = 24)
		@NonNull
		private String adds;
		
		

	}
