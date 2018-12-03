package com.example.ws;

public class Car {

	private String _plateNumber;
	private String _brand;
	private int _price;
	private boolean _rented;
	
	

    public Car(String plateNumber, String _brand, int _price, boolean _rented) {
		super();
		this._plateNumber = plateNumber;
		this._brand = _brand;
		this._price = _price;
		this._rented = _rented;
	}



    public String getPlateNumber() {    
        return _plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this._plateNumber = plateNumber;
    }

    public String getBrand() {
        return _brand;
    }

    public void setBrand(String brand) {
        this._brand = brand;
    }

    public int getPrice() {
        return _price;
    }

    public void setPrice(int price) {
        this._price = price;
    }

    
    public boolean isRented() {
        if(this._rented == true)
        	return true;
        else
        	return false;
    }

    public void setRented(boolean rented) {
        this._rented = rented;
    }

    boolean rentCar() {
    	return this._rented = true;
    }

    boolean getBackCar() {
       if(this._rented == true)
    	   return this._rented = false;
       else
    	   return true;
    }

    @Override
    public String toString() {
    	return "Car [plateNumber=" + this._plateNumber + ", brand=" + this._brand + ", price=" + this._price + "]";
       
    }

}
