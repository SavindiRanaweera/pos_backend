package com.pos.grn.controller;

import com.pos.grn.model.Grn;
import com.pos.grn.service.GrnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grns")
public class GrnController {

    @Autowired
    private GrnService grnService;

    @PostMapping
    public Grn create(@RequestBody Grn grn) {
        return grnService.saveGrn(grn);
    }

    @GetMapping("/{grnCode}")
    public Grn getByCode(@PathVariable String grnCode) {
        return grnService.getGrnByCode(grnCode);
    }

    @GetMapping
    public List<Grn> getAll() {
        return grnService.getAllGrns();
    }

    @DeleteMapping("/{grnCode}")
    public void delete(@PathVariable String grnCode) {
        grnService.deleteGrn(grnCode);
    }

    @PutMapping("/{grnCode}")
    public Grn update(@PathVariable String grnCode, @RequestBody Grn grn) {
        return grnService.updateGrn(grnCode, grn);
    }
}
