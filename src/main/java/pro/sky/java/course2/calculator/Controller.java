package pro.sky.java.course2.calculator;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
    public class Controller {
    private final CalculateServise calculateService;

    public Controller(CalculateServise calculateService){
        this.calculateService = calculateService;
    }
    @GetMapping(produces = MediaType.TEXT_HTML_VALUE)
    public String hello(){
        return "<h1 style = \" color: red \">Добро пожаловать в калькулятор</h1>";
    }
    @GetMapping(path="/plus")
    public String plus(@RequestParam("num1") String num1, @RequestParam("num2") String num2){
        return calculateService.calculate(1, num1, num2);
    }
    @GetMapping(path="/minus")
    public String minus(@RequestParam("num1") String num1, @RequestParam("num2") String num2){
        return calculateService.calculate(2, num1, num2);
    }
    @GetMapping(path="/multiply")
    public String multiply(@RequestParam("num1") String num1, @RequestParam("num2") String num2){
        return calculateService.calculate(3, num1, num2);
    }
    @GetMapping(path="/divide")
    public String divide(@RequestParam("num1") String num1, @RequestParam("num2") String num2){
        return calculateService.calculate(4, num1, num2);
    }
}
