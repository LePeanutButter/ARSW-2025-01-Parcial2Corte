package edu.eci.arsw.myrestaurant.beans;

import edu.eci.arsw.myrestaurant.model.RestaurantProduct;

public interface TaxesCalculator {

	float getProductTaxes(RestaurantProduct p);
	
}
