package com.lista_1.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lista_1.domain.services.Calculate;

@RestController
@RequestMapping("/api/calculate")
public class CalculateController {
    @GetMapping("is-even/{number}")
    public String getIsEven(@PathVariable int number) {
        Calculate calculate = new Calculate();
        return calculate.isEven(number);
    }

    @GetMapping("multiplication-table/{number}")
    public String getMultiplicationTable(@PathVariable int number) {
        Calculate calculate = new Calculate();
        return calculate.multiplicationTable(number);
    }

    @GetMapping("fibonacci/{size}")
    public String getFibonacci(@PathVariable int size) {
        Calculate calculate = new Calculate();
        return calculate.fibonacci(size);
    }

    @GetMapping("numbers-piramid/{size}")
    public String getNumbersPiramid(@PathVariable int size) {
        Calculate calculate = new Calculate();
        return calculate.numbersPiramid(size);
    }
}
