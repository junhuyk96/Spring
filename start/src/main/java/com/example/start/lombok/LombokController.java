package com.example.start.lombok;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lombok")
public class LombokController {
    @GetMapping("getter")
    public LombokGetter getter() {
        LombokGetter getter = new LombokGetter();
        getter.setId(1);

        return getter;
    }

    @GetMapping("getter2")
    public LombokGetter2 getter2() {
        LombokGetter2 getter2 = new LombokGetter2();
        getter2.setId(2);
        getter2.setItem("lombok item");
        getter2.setIsComplete(true);

        return getter2;
    }

    @GetMapping("setter")
    public String setter() {
        LombokSetter setter = new LombokSetter();
        setter.setId(3);
        setter.setItem("lombok setter");
        setter.setIsComplete(false);

        return setter.toString();
    }
}
