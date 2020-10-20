package com.example.arek.dayroutine.Controller;


import com.example.arek.dayroutine.Service.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.HashMap;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/")
public class DayController {

    @Autowired
    private DayService dayService;

    @RequestMapping(value = "show-my-routine", method = RequestMethod.GET)
    public HashMap<Integer, String> getMyDayRoutine() {
        return dayService.getMyDay();
    }

    @RequestMapping(value = "time/{i}", method = RequestMethod.GET)
    public String getByTime(@PathVariable("i") Integer i) {
        return dayService.getMyDayRoutineOnTime(i);
    }

    @RequestMapping(value = "time/{a}/{b}", method = RequestMethod.GET)
    public HashMap<Integer, String> getMyDayRoutineBetween(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        return dayService.getMyDayRoutineBetween(a,b);
    }

    @RequestMapping(value = "spent/{a}", method = RequestMethod.GET)
    public int getTimeSpent(@PathVariable("a") String a) {
        return dayService.getTimeSpent(a);
    }

}
