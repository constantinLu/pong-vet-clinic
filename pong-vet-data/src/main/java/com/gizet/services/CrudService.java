package com.gizet.services;

import java.util.Set;
/**
 * Generic custom crud operations
 */
public interface CrudService<T, ID> {

  Set<T> findAll();

  T findById(ID id);

  T save(T object);

  void delete(T object);

  void deleteById(ID id);

}
