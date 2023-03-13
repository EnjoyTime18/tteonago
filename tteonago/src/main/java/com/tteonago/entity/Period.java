package com.tteonago.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Embeddable
@Getter @Setter
public class Period {
	@NonNull
	@Column(name = "checkIn")
	private LocalDateTime checkIn;
	
	@NonNull
	@Column(name = "checkOut")
	private LocalDateTime checkOut;
}