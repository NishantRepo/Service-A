package org.example.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("v1")
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void testEmployee() {

        System.out.println("V1");
    }
}
