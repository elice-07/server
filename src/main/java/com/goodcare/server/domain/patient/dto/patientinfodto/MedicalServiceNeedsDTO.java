package com.goodcare.server.domain.patient.dto.patientinfodto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MedicalServiceNeedsDTO {
    private Boolean regularCheckups;
    private String treatments;
    private Boolean specialNursing;
}
