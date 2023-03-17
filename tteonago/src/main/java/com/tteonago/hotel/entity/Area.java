package com.tteonago.hotel.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor

@Entity
@Table(name="area")
public class Area {
	
	@Id
	private String aId; 
	
	@Embedded 
	private Position localPosition;
	
	@NonNull
	@Column(name = "level")
    private Integer level;  
	
	@NonNull
	@Column(name = "aName")
	private String aName;

}
