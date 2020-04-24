package com.ruoyi.gwc.service;

/**
 * 矿机
 */
public interface MachineService {

    // TODO Task 计算每日收益 & 注销过期矿机
    void countDailyIncomeAndLogOutMachine();

    /**
     * 初始化矿机
     * @param accountId
     */
    void initMachine(String accountId);

    /**
     * 购买矿机
     * @param accountId
     * @return
     */
    Boolean buyMachine(String accountId);
}
