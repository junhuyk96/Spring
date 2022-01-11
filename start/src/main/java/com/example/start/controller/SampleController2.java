package com.example.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class SampleController2 {

    @RequestMapping("sample/param-map")
    @ResponseBody
    public String smapleParamMap(
            @RequestParam Map<String, Object> parameters
    ) {
        List<String> parametersList = parameters.entrySet().stream()
                .map(entry -> entry.getKey() + " = " + entry.getValue())
                .collect(Collectors.toList());

        return String.join(" , ", parametersList);
    }

    @RequestMapping("sample/param-dto")
    @ResponseBody
    public String sampleParamDTO(
            SampleRequestDTO sampleRequestDTO
    ) {
        return sampleRequestDTO.toString();
    }

    @RequestMapping(value="sample/requestmapping/get",
    method= RequestMethod.GET)
    @ResponseBody
    public String requestMappingGet() {
        return "this is Get Mpping";
    }

    @RequestMapping(value="sample/requestmapping/get-post",
    method={RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String requestMappingGetPost() {
        return "this is Get-POST Mapping";
    }
}
