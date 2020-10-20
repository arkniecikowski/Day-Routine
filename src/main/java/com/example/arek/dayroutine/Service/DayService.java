package com.example.arek.dayroutine.Service;


import com.example.arek.dayroutine.Dao.FakeDayRoutineDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class DayService {

    @Autowired
    public FakeDayRoutineDao fakeDayRoutineDao;

    public HashMap<Integer, String> getMyDay() { return fakeDayRoutineDao.getMyDay(); }

}
