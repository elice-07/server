package com.goodcare.server.domain.patient.dto.patientinfodto;

import com.goodcare.server.domain.patient.dao.patientinfo.Patient;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientDTO {
    private String name;
    private LocalDate dateOfBirth;
    private String gender;
    private String contactNumber;
    private String mainDisease;
    private String underlyingDisease;
}

