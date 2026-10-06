package com.abhilash.constructors5;

public class ElectronicProducts extends Products {
	int productWarranty;
	
	public ElectronicProducts(String _productName, String _productPrice, String _productId, int _productWarranty) {
		super(_productName, _productPrice, _productId);
		this.productWarranty = _productWarranty;
	}
}
