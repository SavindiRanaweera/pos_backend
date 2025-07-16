package com.pos.grn.service;

import com.pos.grn.model.Grn;
import com.pos.grn.repo.GrnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrnServiceImpl implements GrnService {

    @Autowired
    private GrnRepository grnRepository;

    @Override
    public Grn saveGrn(Grn grn) {
        return grnRepository.save(grn);
    }

    @Override
    public Grn getGrnByCode(String grnCode) {
        return grnRepository.findById(grnCode).orElse(null);
    }

    @Override
    public List<Grn> getAllGrns() {
        return grnRepository.findAll();
    }

    @Override
    public void deleteGrn(String grnCode) {
        grnRepository.deleteById(grnCode);
    }

    @Override
    public Grn updateGrn(String grnCode, Grn updatedGrn) {
        Grn existing = grnRepository.findById(grnCode).orElse(null);
        if (existing == null) return null;

        existing.setSupplierInvoiceNo(updatedGrn.getSupplierInvoiceNo());
        existing.setSupplierCode(updatedGrn.getSupplierCode());
        existing.setStaffCode(updatedGrn.getStaffCode());
        existing.setItemCodes(updatedGrn.getItemCodes());
        existing.setDate(updatedGrn.getDate());
        existing.setAmount(updatedGrn.getAmount());
        existing.setPaymentType(updatedGrn.getPaymentType());

        return grnRepository.save(existing);
    }
}
