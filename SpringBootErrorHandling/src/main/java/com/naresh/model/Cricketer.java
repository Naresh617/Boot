package com.naresh.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "IPL")
public class Cricketer {

	@Id

	private int cricketerId;

	private String cricketerName;

	private int cricketerAge;

	private String cricketerCountry;

}
