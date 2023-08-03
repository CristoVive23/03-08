/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Aluno
 */
public class Product {
    
    public String Name;
    public double Price;
    public int Quantity;

    public Product() {
    }

    public Product(String Name, double Price, int Quantity) {
        this.Name = Name;
        this.Price = Price;
        this.Quantity = Quantity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    
    public double TotalValueinStock(){
        return Price *Quantity;
    }
    
    public void addProduct(int Quantity){
        this.Quantity += Quantity;
    }
    
    public void removeProduct(int Quantity){
        this.Quantity -= Quantity;
    }

    @Override
    public String toString() {
        return Name
                +", $ "
                + String.format("%.2f", Price)
                + ", "
                + Quantity
                + " units, Total: $ "
                + String.format("%.2f", TotalValueinStock());
    }
    
    
}
