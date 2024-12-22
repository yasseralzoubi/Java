package com.axsos.s.session;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



    // ... package and other imports you may have

    @Controller
    public class MainController {
        @RequestMapping("/")
        public String dashboard(HttpSession session){
//            If count value is 0 put it 1 ,
            if(session.getAttribute("count") == null){
                session.setAttribute("count", 1);
//             if not increment it by 1
            }
            Integer currentCount = (Integer) session.getAttribute("count");
            session.setAttribute("count", currentCount+1);
//            for only print it
            System.out.println(session.getAttribute("count"));
            return "index.jsp";
        }

            @RequestMapping("/counter")
            public String index(HttpSession session, Model model){
//
                model.addAttribute("count", session.getAttribute("count"));
                return "displayCounter.jsp";
            }


}
