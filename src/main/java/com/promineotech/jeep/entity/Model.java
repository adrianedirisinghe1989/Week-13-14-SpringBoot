package com.promineotech.jeep.entity;

import java.math.BigDecimal;

import lombok.Builder;

@Builder
public class Model {
private String modelId;
private String trimLevel;
private int numDoors;
private int wheelSize;
private BigDecimal basePrice;
}
