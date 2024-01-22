package com.lista_1.api.controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lista_1.api.dto.FindDuplicatesParams;
import com.lista_1.domain.entities.Day;
import com.lista_1.domain.services.Tools;

@RestController
@RequestMapping("/api/tools")
public class ToolsController {

    @PostMapping("find-duplicates")
    public String postFindDuplicates(@RequestBody FindDuplicatesParams params) {
        Tools tools = new Tools();
        return tools.findDuplicates(params.getArray1(), params.getArray2());
    }

    @GetMapping("hollidays")
    public Collection<Day> getHollidays() {
        Tools tools = new Tools();
        return tools.getHollidays();
    }

    @GetMapping("hollidays/{date}")
    public String getIsHolliday(@PathVariable String date) {
        Tools tools = new Tools();
        return tools.isHolliday(date);
    }
}
