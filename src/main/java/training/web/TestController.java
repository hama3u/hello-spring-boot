package training.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import training.Logic.TestLogic;
import training.domain.Customer;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestLogic testLogic;

    @RequestMapping
    @ResponseBody
    public String index() {
        return "testページです。";
    }

    @RequestMapping("/thymeleaf-sample")
    public String thymeleafSample(Model model) {
        model.addAttribute("msg", "testメッセージ");
        Customer customer = new Customer();
        TestForm testForm = new TestForm();
        customer.setCustomerName("なまえ");
        model.addAttribute("customer", customer);
        model.addAttribute("testForm",testForm);
        return "test/thymeleaf-sample";
    }

    @RequestMapping("/complete")
    @ResponseBody
    public String complete(TestForm testForm){
        System.out.println(testForm.getName());
        String hoge = testLogic.registData(testForm);
        System.out.println(hoge);
        return "test/thymeleaf-sample";
    }
}
