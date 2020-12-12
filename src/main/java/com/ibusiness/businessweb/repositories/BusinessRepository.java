package com.ibusiness.businessweb.repositories;

import java.math.BigInteger;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.ibusiness.businessweb.entity.Business;

public interface BusinessRepository extends JpaRepository <Business,Integer>{
	
	@Query("select a from Business a where a.businessman = :businessmanId")
	public Business findBusinessByBusinessmanId(int businessmanId);
	
	//@Query("select b,c from BusinessmanEntity b inner join b.contactDetails c where b.id = :id")
//	@Query("select b from BusinessmanEntity b where b.id = :id")
//	public BusinessLocation findAllDetailsBusinessman(int id);
		
}