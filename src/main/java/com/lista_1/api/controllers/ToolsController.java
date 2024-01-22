package com.lista_1.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lista_1.api.dto.FindDuplicatesParams;
import com.lista_1.domain.services.Tools;

@RestController
@RequestMapping("/api/tools")
public class ToolsController {

    @PostMapping("find-duplicates")
    public String postFindDuplicates(@RequestBody FindDuplicatesParams params) {
        Tools tools = new Tools();
        return tools.findDuplicates(params.getArray1(), params.getArray2());
    }
}
