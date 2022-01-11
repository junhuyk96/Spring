package com.example.start.di;

import org.springframework.stereotype.Service;
import java.util.stream.IntStream;

@Service
public class DiService {
    public int sumAllValues(Integer min, Integer max) {
        return IntStream.range(min, max +1).boxed().mapToInt(i->i).sum();
    }
}