package com.pos.grn.service;

import com.pos.grn.model.Grn;

import java.util.List;

public interface GrnService {
    Grn saveGrn(Grn grn);
    Grn getGrnByCode(String grnCode);
    List<Grn> getAllGrns();
    void deleteGrn(String grnCode);
    Grn updateGrn(String grnCode, Grn updatedGrn);
}
