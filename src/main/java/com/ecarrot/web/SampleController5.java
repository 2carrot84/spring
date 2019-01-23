package com.ecarrot.web;

import com.ecarrot.domain.ProductVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController5 {
    @RequestMapping("/doJSON")
    public @ResponseBody ProductVO doJSON() {
        return new ProductVO("샘플상품", 30000);
    }

}
