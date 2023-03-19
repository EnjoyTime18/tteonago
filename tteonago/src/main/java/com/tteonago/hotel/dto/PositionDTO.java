package com.tteonago.hotel.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter
@ToString
public class PositionDTO {
	private BigDecimal lng;
	
	private BigDecimal lat;
}

