package com.its.dbex.dto.service;

import com.its.dbex.dto.repository.DataRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {
    @Autowired
    private DataRepositoty dateRepository;
    public void save(String val1, String val2) {
        System.out.println("DateRepository.");
        System.out.println("val1 = " + val1 + ", val2 = " + val2);
    }
}
