/*
 * Copyright (C) 2016 Pivotal Software, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.arsw.myrestaurant.restcontrollers;

import edu.eci.arsw.myrestaurant.model.Order;
import edu.eci.arsw.myrestaurant.services.RestaurantOrderServices;

import java.util.concurrent.ConcurrentHashMap;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author hcadavid
 */

@RestController
@RequestMapping("/orders")
public class OrdersAPIController {
    RestaurantOrderServices restaurantOrderServices;

    @GetMapping("/")
    public ResponseEntity<ConcurrentHashMap<Order, Integer>> getOrdersWithPrice() {
        ConcurrentHashMap<Order, Integer> orders = restaurantOrderServices.getOrdersWithPrice();
        if (orders != null) return new ResponseEntity<>(orders, HttpStatus.OK);
        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }
}
