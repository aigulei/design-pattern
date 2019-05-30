package com.ai.gof.structural.compose;

import java.util.ArrayList;
import java.util.List;

public class CourseCatalog extends CatalogComponent{
    private List<CatalogComponent> items = new ArrayList<>();
    private String name;

    public CourseCatalog(String name){
        this.name = name;
    }

    @Override
    public void add(CatalogComponent component) {
        items.add(component);
    }

    @Override
    public void remove(CatalogComponent component) {
        items.remove(component);
    }

    @Override
    public String getName(CatalogComponent component) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for(CatalogComponent catalogComponent:items){
            System.out.print("  ");
            catalogComponent.print();
        }
    }
}
