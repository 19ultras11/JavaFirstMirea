package ru.mirea.task6.number6789;

public class Shop implements Printable{

    private String name;

    public Shop(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print(){
        System.out.println("Name of the product:" + getName());

    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                '}';
    }
}