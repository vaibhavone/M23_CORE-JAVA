package com.cg.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

@SuppressWarnings("unused")
public class DateTimeExample1 {

	
	
		public static void main(String[] args) {
			LocalDate l=LocalDate.now();
			LocalTime t=LocalTime.now();
			LocalDateTime dt=LocalDateTime.now();
		//	LocalDate d=LocalDate.of(2022,Month.FEBRUARY,29);
			System.out.println(l);
			System.out.println(t);
			System.out.println(dt);
			//System.out.println(d);
		}

	}


