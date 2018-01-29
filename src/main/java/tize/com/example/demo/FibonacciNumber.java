package tize.com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciNumber {
    @RequestMapping("/")
    public String Fnumber(@RequestParam("num") int num) {

        String f_number = "";
        int al = num;


        f_number+="<br/>" +num;
        int a2 =num+2;
        f_number+="<br/>" + a2;
        int a3 = 1+a2;
        f_number+="<br/>" + a3;
        int a4=num+a2+a3;
        f_number+="<br/>" + a4;
        for(int i=0;i<=5;i++){

        int output = num+a2+a3+a4;
        f_number+="<br/>" + output;}
            return f_number;


    }

}