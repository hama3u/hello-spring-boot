package training.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import training.domain.Customer;

@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping
    @ResponseBody
    public String index() {
        return "testページです。";
    }

    @RequestMapping("/thymeleaf-sample")
    public String thymeleafSample(Model model) {
        model.addAttribute("msg", "testメッセージ");
        Customer customer = new Customer();
        customer.setCustomerName("なまえ");
        model.addAttribute("customer", customer);
        return "test/thymeleaf-sample";
    }
}
