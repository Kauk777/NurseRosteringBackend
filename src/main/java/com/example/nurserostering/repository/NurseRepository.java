package com.example.nurserostering.repository;

import org.springframework.stereotype.Repository;

import com.example.nurserostering.model.Nurse;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface NurseRepository  extends JpaRepository<Nurse,Long> {

}
