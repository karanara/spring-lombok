package com.example.lombok.Pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class StudentResponse {

	private int id;
	private String first_name;
	private String last_name;
}
