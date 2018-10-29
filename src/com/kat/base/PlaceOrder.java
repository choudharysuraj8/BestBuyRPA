package com.kat.base;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.kat.bean.ClientDetail;
import com.kat.bean.LogParams;
import com.kat.bean.Master;
import com.kat.bean.TransactionDetail;
import com.kat.bean.TransactionOrder;
import com.kat.dao.ClientDetailsDAO;
import com.kat.dao.MasterDAO;
import com.kat.dao.TransactionDetailDAO;
import com.kat.dao.TransactionOrderDAO;
import com.kat.testcases.BestBuyAddCart;
import com.kat.testcases.BestBuyCheckoutTest;
import com.kat.util.LoggerAppender;

public class PlaceOrder {
	// select * from tblMaster;
	// select * from tblDetails; --masterId
	// select * from tblTransactionDetails; -- deatilId
	// select * from tblTransactionOrders; -- transactiondetailId
	//https://www.bestbuy.com/site/mcfarlane-toys-five-nights-at-freddys-series-1-plastic-8-bit-buildable-figure-styles-may-vary/5715718.p?skuId=5715718
	static Logger logger = Logger.getLogger(PlaceOrder.class);

	public static void main(String[] args) {
		List<Master> masterList = MasterDAO.getAllMasters();
		System.out.println(masterList);
		
		for (Master master : masterList) {
			List<ClientDetail> clientDetailList = ClientDetailsDAO.getClientDetailsbyMasterId(master.getId());
			for (ClientDetail clientDetail : clientDetailList) {
				List<TransactionDetail> transactionDetailList = TransactionDetailDAO
						.getTransactionDetailbyDetailId(clientDetail.getDetailId());
				for (TransactionDetail transactionDetail : transactionDetailList) {
					System.out.println(
							"transactionDetail.getTransactionStatus() --> " + transactionDetail.getTransactionStatus());
					try {
						if ((transactionDetail.getTransactionStatus() != null)
								&& transactionDetail.getTransactionStatus().equals("NW")) {
							transactionDetail.setTransactionStatus("Processing");
							TransactionDetailDAO.updateStatus(transactionDetail);
							List<TransactionOrder> transactionOrderList = TransactionOrderDAO
									.getTransactionOrderbyTransactionDetailId(
											transactionDetail.getTransactionDetailId());
							System.out.println("transactionOrderList-->" + transactionOrderList);
							Iterator<TransactionOrder> iterator = transactionOrderList.iterator();
							InitializeBrowser.InvokeBrowser();
							BestBuyAddCart.setCountry_flag(true);
							for (TransactionOrder transactionOrder : transactionOrderList) {
								
								LogParams logParams = new LogParams(master.getSession_id(),master.getId(), clientDetail.getDetailId(),
										transactionDetail.getTransactionDetailId(), transactionOrder.getOrderId());
								logger = LoggerAppender.loggerCreation(logParams);
								logger.info("logger created Successfully");
								logger.info("transactionOrder ID --> " + transactionOrder.getOrderId());
								logger.info("transactionOrder Count --> " + transactionOrder.getOrderCount());
								logger.info("transactionOrder URL --> " + transactionOrder.getUrl());
								
								
								BestBuyAddCart.addToCart(transactionOrder);
								
							/*	for (int count = 1; count <= transactionOrder.getOrderCount(); count++) {
									logger.info("Loop count for transaction --> " + count);
									InitializeBrowser.InvokeBrowser(transactionOrder.getUrl());
									transactionOrder.setOrderPlaced(count);
									TransactionOrderDAO.update(transactionOrder);
									if(numberOfOrder == clientDetail.getNumberOfOrderPerAccount()){
										BestBuyCheckoutTest.dummyCheckout();
									}
								}*/
								
								
								//BestBuyCheckoutTest.dummyCheckout(transactionOrder.getUrl());
							}
							
							
							BestBuyCheckoutTest.initCheckoutProcess(clientDetail);
						
							transactionDetail.setTransactionStatus("PRCD");
							transactionDetail.setTrackingStatus("NW");
							transactionDetail.setTransactionNumber("ODR"+transactionDetail.getTransactionDetailId());
							transactionDetail.setTrackingNumber("TRN"+transactionDetail.getTransactionDetailId());
							TransactionDetailDAO.update(transactionDetail);
						} else {
							logger.info("Record are new or not Proceed");
							System.out.println("Already Proceed");
						}
					} catch (Exception e) {
						transactionDetail.setTransactionStatus("NPRCD");
						TransactionDetailDAO.updateStatus(transactionDetail);
						logger.info(e.getMessage());
					}
				}
			}
		}
	}
}
