package com.schoolHub;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

public class Student {

	@SequenceGenerator(name="seq",initialValue=2025057001,allocationSize=1)
	@GeneratedValue(generator="seq",strategy=GenerationType.SEQUENCE)
	@Id
	@Column(name = "STUDENT_ID")
    private Integer studentId;
    
    @Column(name = "STUDENT_FNAME",length = 30)  
    private String student_firstName;
    
    @Column(name = "STUDENT_LNAME",length = 30)  
    private String student_lastName;
   
    @Column(name = "FATHER_NAME",length = 30) 
    private String fatherName;

    @Column(name = "MOTHER_NAME",length = 30) 
    private String motherName;

    @Column(name = "GENDER",length = 30)  
    private String gender;

    @Column(name = "AADHAR_NUMBER",length = 30) 
    private Long aadharNumber;

    @Column(name = "DOB") 
    private LocalDate dateOfBirth;

    @ElementCollection
    @CollectionTable(name="STUDENT_BOARD",joinColumns = @JoinColumn(name="STUDENT_ID"))	
    @Column(name="stud_board")																			//1.ssc 2.cbsc  input drop down >  two way's		//list
    private List<String> board;  

    @Column(name = "SCHOOL",length = 30) 
    private String school; 
    
    @Column(name = "RESERVATION",length = 30) 
    private String reservationType;
 
    @Column(name = "CONTACT_NUMBER") 
    private Long contactNumber;

    @Column(name = "ADDRESS",length = 100)   
    private String address;

    @Column(name = "JOIN_DATE") 
    private LocalDate enrollmentDate;

    @ElementCollection
    @CollectionTable(
        name = "STUDENT_SECTIONS",
        joinColumns = @JoinColumn(name = "STUDENT_ID")
    )
    @Column(name = "SECTION")
    private List<String> sections;

    @ElementCollection
    @CollectionTable(
        name = "STUDENT_LANGUAGES", 
        joinColumns = @JoinColumn(name = "STUDENT_ID") 
    )
    @Column(name = "LANGUAGES")
    private List<String> languages;
    
    @ManyToOne
    @JoinColumn(name="branch_id")
    private Branch branch;

}
