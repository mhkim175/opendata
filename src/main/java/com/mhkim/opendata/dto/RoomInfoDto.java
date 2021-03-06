package com.mhkim.opendata.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RoomInfoDto {
    
    private String name;
    private String count;
    private String checkIn;
    private String checkOut;
    
}
