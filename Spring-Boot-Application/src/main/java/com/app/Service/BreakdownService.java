package com.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entity.Breakdown;
import com.app.Exception.BreakdownRequesetNotFoundException;
import com.app.Repository.BreakdownRequestRepository;

@Service
public class BreakdownService {
	@Autowired
	BreakdownRequestRepository breakdownRequestRepository;

	public Breakdown addBreakdown(Breakdown breakdown) {
		return breakdownRequestRepository.save(breakdown);
	}

	public List<Breakdown> getBreakdown(Long uid) {
		return breakdownRequestRepository.findByUserId(uid);
	}

	public List<Breakdown> getAllBreakDowns() {
		return breakdownRequestRepository.findAll();
	}
	public Breakdown updateStatus(Long id,String Status) {
		Breakdown breakdown=breakdownRequestRepository.findById(id).orElseThrow(() -> new BreakdownRequesetNotFoundException("BreakDown does not exist or wrong breakdown typed"));
		breakdown.setStatus(Status);
		return breakdownRequestRepository.save(breakdown);
	}
}
