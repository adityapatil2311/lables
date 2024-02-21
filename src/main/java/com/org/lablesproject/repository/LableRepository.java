package com.org.lablesproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.lablesproject.entity.Lables;

public interface LableRepository extends JpaRepository<Lables, Integer> {

}
