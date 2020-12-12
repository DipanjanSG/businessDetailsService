package com.ibusiness.businessweb.repositories;

import java.math.BigInteger;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ibusiness.businessweb.entity.Product;

public interface ProductRepository extends JpaRepository <Product,Integer>{
			
}