package com.bilgeadam.utility;

import java.util.List;
import java.util.Optional;

public interface ICrud <T, ID>{
    List<T> findAll();
    Optional<T> findById(ID id);
    T save(T entity);
    void update(T entity);
    Iterable<T> saveAll(Iterable<T> entites);
    void delete(T entity);
    void deleteById(ID id);
    boolean existById(ID id);
    List<T> findByEntity(T entity);
    List<T> findByColumnNameAndValue(String columnName, String value);
}