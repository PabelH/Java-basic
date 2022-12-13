package com.example;

public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save() {
    }

    @Override
    public void findAll() {
    }

    @Override
    public void delete() {
    }

    String save = "Guardando";
    String findAll = "Buscar todo";
    String delete = "Borrando";

    @Override
    public String toString() {
        return "CocheCRUDImpl" +
                " save=" + save +
                ", findAll=" + findAll +
                ", delete=" + delete;
    }
}
