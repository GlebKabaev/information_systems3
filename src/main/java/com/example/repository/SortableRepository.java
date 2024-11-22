package com.example.repository;

import java.io.IOException;
import java.util.List;

import com.example.model.ShortBook;

public interface SortableRepository extends Repository {
    List<ShortBook> sort_get_k_n_shortList(int k, int n, String sort, int min, int max) throws IOException; ;
    
}
