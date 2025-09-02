package com.schoolHubApplication.common;

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
import jakarta.persistence.Table;
import lombok.Data;
//STUDENT JAVA CLASS
@Entity
@Data
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDENT_ID")
    private Integer studentId;

    @Column(name = "STUDENT_NAME")
    private String studentFullName;

    @Column(name = "FATHER_NAME")
    private String fatherName;

    @Column(name = "MOTHER_NAME")
    private String motherName;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "AADHAR_NUMBER")
    private Long aadharNumber;

    @Column(name = "DOB")
    private LocalDate dateOfBirth;

    @Column(name = "BOARD")
    private String board;

    @Column(name = "SCHOOL")
    private String school; 
    
    @Column(name = "RESERVATION")
    private String reservationType;
    
    @Column(name = "CONTACT_NUMBER")
    private String contactNumber;

    @Column(name = "ADDRESS")
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

