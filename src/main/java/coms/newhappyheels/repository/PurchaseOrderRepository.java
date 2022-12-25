package coms.newhappyheels.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import coms.newhappyheels.model.PurchaseOrder;



public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
	
	

}
