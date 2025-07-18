package com.cognizant.loan.service;

import org.springframework.stereotype.Service;

import com.cognizant.loan.model.Loan;

@Service
public class LoanService {
    public Loan getLoanDetails(String num) {
        return new Loan(num, "House", 5000000, 11258, 60);
    }
}
