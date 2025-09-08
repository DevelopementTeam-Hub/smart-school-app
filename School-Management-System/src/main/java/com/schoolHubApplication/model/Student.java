package com.schoolHubApplication.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
//STUDENT JAVA CLASS
@Entity
@Data
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	/*@SequenceGenerator(name="SEQ",initialValue = 394190,allocationSize = 1) 2025057001
	@GeneratedValue(generator ="SEQ",strategy=GenerationType.SEQUENCE)*/
    @Column(name = "STUDENT_ID")
    private Integer studentId;
    
    @Column(name = "STUDENT_FNAME")  //initial name  input
    private String student_firstName;
    
    @Column(name = "STUDENT_LNAME")  //input button
    private String student_lastName;
   
    @Column(name = "FATHER_NAME") //input button
    private String fatherName;

    @Column(name = "MOTHER_NAME") //input button
    private String motherName;

    @Column(name = "GENDER")  //radio button
    private String gender;

    @Column(name = "AADHAR_NUMBER") //input button
    private Long aadharNumber;

    @Column(name = "DOB") // dob calendar 
    private LocalDate dateOfBirth;

    @ElementCollection
    @CollectionTable(name="STUDENT_BOARD",joinColumns = @JoinColumn(name="STUDENT_ID"))	
    @Column(name="stud_board")																			//1.ssc 2.cbsc  input drop down >  two way's		//list
    private List<String> board;  //	STUDENT_BOARD  DEFAULT

    @Column(name = "SCHOOL") //drop down  Input   //list
    private String school; 
    
    @Column(name = "RESERVATION") //input  //list
    private String reservationType;
 
    @Column(name = "CONTACT_NUMBER") //input
    private String contactNumber;

    @Column(name = "ADDRESS")  //input 
    private String address;

    @Column(name = "JOIN_DATE")  //local 
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
        name = "STUDENT_LANGUAGES", // name of the separate table
        joinColumns = @JoinColumn(name = "STUDENT_ID") // foreign key to the Student table
    )
    @Column(name = "LANGUAGES")
    private List<String> languages;

    	
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "STUDENT_ID")
    private List<AttendanceRecord> attendanceRecords;
    
    @ElementCollection
    @CollectionTable(
        name = "STUDENT_PARENT_CONTACTS",
        joinColumns = @JoinColumn(name = "STUDENT_ID")
    )
    private List<ParentContact> parentDetails;

    @Column(name = "PROFILE")
    private String profilePhoto;

//    Location Information
    @Column(name = "STATE")
    private String state;

    @Column(name = "DISTRICT")
    private String district;
    
    @Column(name = "BRANCH_TYPE")	//dayScholar
    private String branchType;
    
    @Column(name = "CAMPUS")  //co-education 
    private String campusType;

    @Column(name = "BRANCH")//branch of school different branch code
    private String branch;
    
    @Column(name = "CLASS_NAME") //section  batchNO  class room
    private String className;
    
    @Column(name = "HOSTEL") //day
    private String dayHostel;	       
}

