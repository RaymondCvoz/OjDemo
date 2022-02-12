package raymond.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import raymond.pojo.TestObj;
import raymond.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController
{
    @Autowired
    @Qualifier("testServiceImpl")
    private TestService testService;

    @RequestMapping("/fetchAllObj")
    public String list(Model model) throws JsonProcessingException
    {
       TestObj testObj = testService.queryObjByID(1);
       System.out.println(testObj.getDetail());
        return "allObj";
    }
}
