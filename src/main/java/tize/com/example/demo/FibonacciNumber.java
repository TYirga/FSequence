package tize.com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciNumber {
    @RequestMapping("/")
    public String Fnumber(@RequestParam("num") int num, @RequestParam("count") int count) {

        String f_number = "";
        int a1 = 0;
        f_number+="<br/>" +a1;
        int a2 =0;
        f_number+="<br/>" + a2;
        int a3 = 1;
        f_number+="<br/>" + a3;
        int a4=num;
        f_number+="<br/>" + a4;
        for(int i=0;i<count;i++){
         int a5=a1+a2+a3+a4;
            f_number+="<br/>" +a5;
            a1=a2;
            a2=a3;
            a3=a4;
            a4=a5;}
            return f_number;


    }

}