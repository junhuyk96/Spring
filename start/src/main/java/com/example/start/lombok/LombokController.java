package com.example.start.lombok;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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

    @GetMapping("data")
    public Map data() {
        LombokData data = new LombokData(4);
        data.setItem("lombok data");
        data.setIsComplete(true);

        LombokData compareData = new LombokData(-4);

        Map<String, Object> map = new HashMap<>();

        map.put("var id", data.getId());
        map.put("var item", data.getItem());
        map.put("var isComplete", data.getIsComplete());
        map.put("class", data.getClass());
        map.put("toString", data.toString());
        map.put("hashCode", data.hashCode());
        map.put("equals", data.equals(compareData));
        map.put("canEqual", data.canEqual(compareData));

        return map;
    }

    @GetMapping("no-args")
    public String noArgs() {
        LombokNoArgs noArgs = new LombokNoArgs();
        return noArgs.toString();
    }

    @GetMapping("has-args")
    public Map<String, Object> allArgs() {
        LombokHasArgs requiredArgs = new LombokHasArgs("lombok" +
                " required args");
        LombokHasArgs allArgs = new LombokHasArgs(5, "lombok all args",
                false);

        Map<String, Object> map = new HashMap<>();
        map.put("requiredArgs", requiredArgs.toString());
        map.put("alloArgs", allArgs.toString());

        return map;
    }
}
