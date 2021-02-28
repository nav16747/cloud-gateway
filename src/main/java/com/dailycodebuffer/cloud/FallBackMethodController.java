package com.dailycodebuffer.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {


        @GetMapping("/userserviceFallBack")
        public String userServiceFallBackMethod()
        {
            return  "User service is taking more time than expected. "+
                    "Please try again later";
        }

        @GetMapping("/deptServiceFallBack")
        public String departmentServiceFallBackMethod(){
            return "Department service is taking more time then expected."+
                    "Please try again later";

        }

}
