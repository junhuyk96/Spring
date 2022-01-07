package com.example.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PracController {
    @GetMapping("Step1")
    public String step1(Model model) {
        model.addAttribute("data", "GetMapping을");
        model.addAttribute("data1","아직도 모르겠다.");
        return "Step1";
    }

    @GetMapping("prac-mvc")
    public String pracMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "prac-template";
    }

    @GetMapping("prac-string")
    @ResponseBody
    public String pracString(@RequestParam("name") String name) {
        return "hello " + name;
    }

    @GetMapping("prac-api")
    @ResponseBody
    public Prac PracApi(@RequestParam("name") String name, @RequestParam("id") int id) {
        Prac prac = new Prac();
        prac.setName(name);
        prac.setId(id);
        return prac;
    }

    static class Prac {
        private String name;
        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
