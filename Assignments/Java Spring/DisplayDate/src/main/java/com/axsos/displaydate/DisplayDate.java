package com.axsos.displaydate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DisplayDate {
    @RequestMapping("/")
    public String dashboard() {
        return "dashboard.jsp";
    }

    @RequestMapping("/date")
    public String displayDate() {


        return "date.jsp";
    }

    @RequestMapping("/time")
    public String time() {
        return "time.jsp";
    }


}



