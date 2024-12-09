package org.example.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("v2")
public class EmployeeServiceV2Impl implements EmployeeService{
    @Override
    public void testEmployee() {
        System.out.println("v2");
    }
}
