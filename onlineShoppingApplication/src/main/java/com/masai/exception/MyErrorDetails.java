package com.masai.exception;

import java.time.LocalDateTime;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class MyErrorDetails {
	
	private LocalDateTime timeStamp;
	private String message;
	private String Description;
	

	
	

}