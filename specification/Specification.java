package com.nth.linq.query.specification;

import com.nth.linq.query.criteria.Criteria;

public interface Specification<T> {

  boolean match(T item, Criteria<T> one, Criteria<T> other);

}
