package com.freeefly.springbootreact;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ViewController {
    @GetMapping(value={"/", ""})
    public String index1(){
        return "index";
    }

    //     api/users/1
    @GetMapping("/api/v1/list")
    @ResponseBody
    public List<String> getProject() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        return list;
    }

}