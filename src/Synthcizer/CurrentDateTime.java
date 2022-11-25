package Synthcizer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime extends SynthApplication {

	 LocalDate now = LocalDate.now();
	 
	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

	 String formatedNow = now.format(formatter);
}
