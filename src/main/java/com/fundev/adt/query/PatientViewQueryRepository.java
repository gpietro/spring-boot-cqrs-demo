package com.fundev.adt.query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PatientViewQueryRepository extends JpaRepository<PatientView, UUID> {
}