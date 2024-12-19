package com.microsoft.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@Table(name="employeeDetails")
public class EmployeeDetailsEntity {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    @Column
	private int employeeId;
    @Column
	private String employeeName;
    @Column
	private String employeeDesignation;
    @Column
	private String employeeSalary;
    @Column
    private String employeeDOB;
    @Column
    private Long employeePhoneNumber;
    @Column
    private String employeeEmail;
    @Column
	private String employeeJoiningDate;
    
	
	
	
	
}
