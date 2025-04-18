package com.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entity.Breakdown;

public interface BreakdownRequestRepository extends JpaRepository<Breakdown, Long>{
 List<Breakdown> findByUserId(Long id);
}
