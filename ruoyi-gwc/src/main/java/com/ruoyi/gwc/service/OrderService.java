package com.ruoyi.gwc.service;

import com.ruoyi.gwc.domain.Order;
import com.ruoyi.gwc.dto.OrderCreateDTO;

import java.util.List;

/**
 * 交易
 */
public interface OrderService {

    /**
     * 创建订单
     * @param accountId
     * @return
     */
    Boolean createOrder(String accountId, OrderCreateDTO order);

    /**
     * 获取所有订单
     * @return
     */
    List<Order> getAllOrders();

    /**
     * 根据用户ID获取订单列表
     * @param accountId
     * @return
     */
    List<Order> getOrders(String accountId);

    /**
     * 订单Id
     * @param orderId
     * @return
     */
    Order getOrder(String orderId);


}
