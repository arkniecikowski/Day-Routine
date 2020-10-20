package com.example.arek.dayroutine.Dao;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class FakeDayRoutineDao {

    private static HashMap<Integer, String> day;

    static {
        day = new HashMap<Integer, String>() {
            {
                put(1, "sleep");
                put(2, "work");
                put(3, "work");
                put(4, "sport");
                put(5, "sleep");
            }
        };
    }

    public HashMap<Integer, String> getMyDayRoutine() {
        return this.day;
    }

    public String getMyDayRoutineOnTime(Integer i) {
        return this.day.get(i);
    }

    public HashMap<Integer, String> getMyDayRoutineBetween(Integer a, Integer b) {
        HashMap<Integer, String> m = new HashMap<>();

        if (Integer.valueOf(a) == Integer.valueOf(b) || Integer.valueOf(a) > Integer.valueOf(b)) {
            throw new ArithmeticException("Something wrong");
        } else {
            for (Map.Entry me : day.entrySet()) {
                if ((Integer) me.getKey() >= a && (Integer) me.getKey() <= b) {
                    m.put((Integer) me.getKey(), (String) me.getValue());
                }
            }
            return m;
        }
    }

    public int getTimeSpent(String a) {
        int time = 0;

        for (Map.Entry me : day.entrySet()) {
            if (me.getValue().toString().equals(a))  {
                System.out.println(me.getValue());
                time++;
            }
        }
        return time;
    }


}
