package com.demo.model; 
 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; import javax.persistence.Id; 
 
import lombok.AllArgsConstructor; import lombok.Data; 
import lombok.NoArgsConstructor; import lombok.NonNull; 
import lombok.RequiredArgsConstructor; 
 
@Data 
@NoArgsConstructor 
@RequiredArgsConstructor 
@AllArgsConstructor 	
@Entity 
public class Student { 
 	@Id 
 	@GeneratedValue  			
 	private Integer stdId;  		
 	@NonNull 
 	private String stdName;  			
 	@NonNull 
 	private Double stdFee;  			
 	@NonNull 
 	private String stdCourse; 
} 
