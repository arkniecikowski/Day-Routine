package com.example.arek.dayroutine.Dao;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

@Repository
public class FakeDayRoutineDao {

    private static HashMap<Integer, String> day;

    static {
        day = new HashMap<Integer, String>() {
            {
                put(1, "Odpoczyne");
                put(1, "Praca");
            }
        };
    }

    public HashMap<Integer, String> getMyDay() {
        return this.day;
    }

}
