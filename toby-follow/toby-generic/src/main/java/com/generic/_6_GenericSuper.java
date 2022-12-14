package com.generic;

import java.util.*;

public class _6_GenericSuper {
    static class MyList<E, P> implements List<E> {

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<E> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(E e) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends E> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends E> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public E get(int index) {
            return null;
        }

        @Override
        public E set(int index, E element) {
            return null;
        }

        @Override
        public void add(int index, E element) {

        }

        @Override
        public E remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<E> listIterator() {
            return null;
        }

        @Override
        public ListIterator<E> listIterator(int index) {
            return null;
        }

        @Override
        public List<E> subList(int fromIndex, int toIndex) {
            return null;
        }
    }

    static <T> void method(T t, List<T> list) {

    }

    public static void main(String[] args) {
        // Number - ??????
        // Flot, Bigdecimal ??? - ??????

        Integer i = 10;
        Number n = i; // ??????????????? -> ???????????????

        // List<Integer> ??? List<Number> ??? ?????? ????????? ?????????.
        List<Integer> intList = new ArrayList<>();
//        List<Number> numberList = intList; // ????????? ?????? ??????

        // ArrayList<Integer> ??? List<Integer>??? ?????? ????????????.
        ArrayList<Integer> arrList = new ArrayList<>();
        List<Integer> intList2 = arrList; // ??????

        // ??????
        List<String> strings = new MyList<String, Integer>();
        List<String> strings1 = new MyList<String, String>();

        method(1, Arrays.asList(1, 2, 3)); // ?????? ?????? ??????
//        Generics.<Integer>method(1, Arrays.asList(1, 2, 3)); // ?????? ?????? ????????? ??????

        // ?????? ?????? ??????
        List<String> str = new ArrayList<>();

        List<String> c1 = Collections.emptyList(); // String ????????? ???????????? ???????????? ??????????????? ???????????? ?????? ?????? ??????
        List<String> c2 = Collections.<String>emptyList(); // ????????? ?????? ??????
    }
}
