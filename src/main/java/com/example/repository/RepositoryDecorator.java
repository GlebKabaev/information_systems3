package com.example.repository;

import java.util.List;

import com.example.model.ShortBook;

public class RepositoryDecorator implements Repository{
    private Repository repository;
    public RepositoryDecorator(Repository repository) {
        this.repository = repository;
    }

    @Override
    public List<ShortBook> get_k_n_shortList(int k, int n) throws Exception {
        return repository.get_k_n_shortList(k,  n);
    }
}
