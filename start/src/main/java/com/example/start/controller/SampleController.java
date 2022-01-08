package com.example.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @RequestMapping(value = "sample")
    @ResponseBody
    public String sample() {
        return "Hello World! this is Simple";
    }

    @RequestMapping("sample/not-value")
    @ResponseBody
    public String sample2() {
        return "RequestMapping without value property";
    }

    @RequestMapping("sample/path/{param}")
    @ResponseBody
    public String samplePath(
            @PathVariable("param") String parameter
    ) {
        return "Request Path Parameter : " + parameter;
    }

    @RequestMapping("sample/query-string")
    @ResponseBody
    public String sampleQueryString(
            @RequestParam("param") String parameter
    ) {
        return "Sample Query String :" + parameter;
    }

    @RequestMapping("sample/query-string-many")
    @ResponseBody
    public String sampleQueryString(
            @RequestParam("param1") String parameter1,
            @RequestParam("param2") String parameter2
    ) {
        return "Many Query String : param 1 = " + parameter1 +
                " param 2 = " + parameter2;
    }

    @RequestMapping("sample/query-string-option")
    @ResponseBody
    public String sampleQueryStringOption(
            @RequestParam(value = "required") String required,
            //required의 default 값은 true
            @RequestParam(value = "not_required", required = false) String notRequired,
            //RequestParam에서 required=false 옵션이 있다면 선태적 매개변수이다.
            @RequestParam(value = "default_value", defaultValue = "default value") String defaultValue
            //RequestParam에서 defaultValue 속성이 있다면 선택적 매개변수이다.
            //쿼리 스트링이 전달되지 않으면 기본값은 defaultValue에서 지정한 값에 따른다.
    ) {
        return String.format(
                "Query String Options. required = %s, notRequired = %s, defaultValue = %s",
                required, notRequired, defaultValue
        );
    }

    @RequestMapping("sample/without-request-param")
    @ResponseBody
    public String sampleWithoutRequestParam(String value) {
        return value;
    }
}
