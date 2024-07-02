package com.example.saleservice.service;

import com.example.saleservice.model.Sale;
import com.example.saleservice.repository.SaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListSalesService {

    private final SaleRepository saleRepository;


    //TODO td(name: Faltam testes unitários;)

    public List<Sale> listAllSales() {
        return saleRepository.findAll();
    }
}