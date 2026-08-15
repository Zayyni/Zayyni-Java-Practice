package com.zayyni.hospitalmanagementservice.dto;

import com.zayyni.hospitalmanagementservice.entity.type.BloodGroupType;
import lombok.Data;

@Data
public class BloodGroupStats {
    private final BloodGroupType bloodGroupType;
    private final Long count;
}
