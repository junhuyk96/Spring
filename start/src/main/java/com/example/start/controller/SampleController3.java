package com.example.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleController3 {
    @GetMapping("sample/get-mapping")
    @ResponseBody
    public String sampleGetMapping() {
        return "this is get mapping example";
    }

    @PostMapping("sample/post-mapping")
    @ResponseBody
    public String samplePostMapping() {
        return "this is post mapping example";
    }

    @PutMapping("smple/put-mapping/{id}")
    @ResponseBody
    public String samplePutMapping(
            @PathVariable("id") Integer id,
            @RequestBody SampleRequestDTO sampleRequestDTO
    ) {
        return "this is put mapping example. id = " + String.valueOf(id)
                + "\n" + sampleRequestDTO.toString();
    }

    @PatchMapping("sample/patch-mapping/{id}")
    @ResponseBody
    public String samplePatchMapping(
            @PathVariable("id") Integer id,
            @RequestBody SampleRequestDTO sampleRequestDTO
    ) {
        return "this is patch mapping example. id = " + String.valueOf(id)
                + "\n" + sampleRequestDTO.toString();
    }
}
