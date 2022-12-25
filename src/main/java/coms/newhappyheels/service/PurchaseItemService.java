package coms.newhappyheels.service;

import java.util.List;

import coms.newhappyheels.model.PurchaseItem;
import coms.newhappyheels.model.PurchaseOrder;
import coms.newhappyheels.model.User;



public interface PurchaseItemService {

	public PurchaseItem getPurchaseItemById(Long id);

	public List<PurchaseItem> getAllItemsByPurchaseOrder(PurchaseOrder order);

	public List<PurchaseItem> getAllPurchaseItemByUserId(User userId);

	public PurchaseItem savePurchaseItem(PurchaseItem purchaseItem);

	public List<PurchaseItem> getAllPurchaseItemList();

}
