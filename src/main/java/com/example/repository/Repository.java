package com.example.repository;

import java.util.List;

import com.example.model.ShortBook;

public interface Repository {
   
public List<ShortBook> get_k_n_shortList(int k,int n) throws Exception;

} 