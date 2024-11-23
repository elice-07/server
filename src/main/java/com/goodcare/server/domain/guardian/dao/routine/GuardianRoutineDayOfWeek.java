package com.goodcare.server.domain.guardian.dao.routine;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="guardian_routine_day_of_week")
public class GuardianRoutineDayOfWeek {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
    private Long id;

    @Column(name="routine_code", nullable = false)
    private String routineCode;

    @Column(name = "days_of_week")
    private String daysOfWeek; // 요일 지정 (월, 화, 수 등)
}
