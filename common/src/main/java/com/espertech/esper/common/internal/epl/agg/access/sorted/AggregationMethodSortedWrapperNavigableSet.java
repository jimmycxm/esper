/*
 ***************************************************************************************
 *  Copyright (C) 2006 EsperTech, Inc. All rights reserved.                            *
 *  http://www.espertech.com/esper                                                     *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 ***************************************************************************************
 */
package com.espertech.esper.common.internal.epl.agg.access.sorted;

import com.espertech.esper.common.internal.collection.UnmodifiableIterator;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static com.espertech.esper.common.internal.epl.agg.access.sorted.AggregationMethodSortedWrapperNavigableMap.immutableException;

public class AggregationMethodSortedWrapperNavigableSet implements NavigableSet<Object> {
    private final NavigableSet<Object> sorted;

    public AggregationMethodSortedWrapperNavigableSet(NavigableSet<Object> sorted) {
        this.sorted = sorted;
    }

    public Comparator<? super Object> comparator() {
        return sorted.comparator();
    }

    public Object first() {
        return sorted.first();
    }

    public Object last() {
        return sorted.last();
    }

    public int size() {
        return sorted.size();
    }

    public boolean isEmpty() {
        return sorted.isEmpty();
    }

    public boolean contains(Object o) {
        return sorted.contains(o);
    }

    public Object[] toArray() {
        return sorted.toArray();
    }

    public <T> T[] toArray(T[] a) {
        return sorted.toArray(a);
    }

    public boolean add(Object o) {
        throw immutableException();
    }

    public boolean remove(Object o) {
        throw immutableException();
    }

    public boolean containsAll(Collection<?> c) {
        return sorted.containsAll(c);
    }

    public boolean addAll(Collection<?> c) {
        throw immutableException();
    }

    public boolean retainAll(Collection<?> c) {
        throw immutableException();
    }

    public boolean removeAll(Collection<?> c) {
        throw immutableException();
    }

    public void clear() {
        throw immutableException();
    }

    public Spliterator<Object> spliterator() {
        return sorted.spliterator();
    }

    public boolean removeIf(Predicate<? super Object> filter) {
        throw immutableException();
    }

    public Stream<Object> stream() {
        return sorted.stream();
    }

    public Stream<Object> parallelStream() {
        return sorted.parallelStream();
    }

    public void forEach(Consumer<? super Object> action) {
        sorted.forEach(action);
    }

    public Object lower(Object o) {
        return sorted.lower(o);
    }

    public Object floor(Object o) {
        return sorted.floor(o);
    }

    public Object ceiling(Object o) {
        return sorted.ceiling(o);
    }

    public Object higher(Object o) {
        return sorted.higher(o);
    }

    public Object pollFirst() {
        throw immutableException();
    }

    public Object pollLast() {
        throw immutableException();
    }

    public Iterator<Object> iterator() {
        return new UnmodifiableIterator<>(sorted.iterator());
    }

    public NavigableSet<Object> descendingSet() {
        return new AggregationMethodSortedWrapperNavigableSet(sorted.descendingSet());
    }

    public Iterator<Object> descendingIterator() {
        return new UnmodifiableIterator<>(sorted.descendingIterator());
    }

    public NavigableSet<Object> subSet(Object fromElement, boolean fromInclusive, Object toElement, boolean toInclusive) {
        return new AggregationMethodSortedWrapperNavigableSet(sorted.subSet(fromElement, fromInclusive, toElement, toInclusive));
    }

    public NavigableSet<Object> headSet(Object toElement, boolean inclusive) {
        return new AggregationMethodSortedWrapperNavigableSet(sorted.headSet(toElement, inclusive));
    }

    public NavigableSet<Object> tailSet(Object fromElement, boolean inclusive) {
        return new AggregationMethodSortedWrapperNavigableSet(sorted.tailSet(fromElement, inclusive));
    }

    public SortedSet<Object> subSet(Object fromElement, Object toElement) {
        return new AggregationMethodSortedWrapperSortedSet(sorted.subSet(fromElement, toElement));
    }

    public SortedSet<Object> headSet(Object toElement) {
        return new AggregationMethodSortedWrapperSortedSet(sorted.headSet(toElement));
    }

    public SortedSet<Object> tailSet(Object fromElement) {
        return new AggregationMethodSortedWrapperSortedSet(sorted.tailSet(fromElement));
    }
}
