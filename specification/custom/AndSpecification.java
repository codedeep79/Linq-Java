package com.nth.linq.query.specification.custom;

import com.nth.linq.query.criteria.Criteria;
import com.nth.linq.query.specification.Specification;

public class AndSpecification<T> implements Specification<T> {

  @Override
  public boolean match(T item, Criteria<T> one, Criteria<T> other) {
    return one.match(item) && other.match(item);
  }

}
