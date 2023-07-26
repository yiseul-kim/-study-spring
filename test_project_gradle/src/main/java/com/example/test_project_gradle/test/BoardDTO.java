package com.example.test_project_gradle.test;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

@Data
public class BoardDTO {
	private String b_id;
	private String title;
	private String content;
}
