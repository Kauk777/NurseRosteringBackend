package com.example.nurserostering.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nurserostering.model.FrontEndData;

@Repository
public interface FrontEndDataRepo extends JpaRepository<FrontEndData,Long> {

}
