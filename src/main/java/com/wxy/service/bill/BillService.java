package com.wxy.service.bill;

import com.wxy.pojo.Bill;

import java.util.List;

/**
 * @author Administrator
 * @Auther: wuxy
 * @Date: 2021/2/26 - 02 - 26 - 20:56
 * @Description: com.wxy.service.bill
 * @version: 1.0
 */
public interface BillService {
    /**
     * 增加订单
     *
     * @param bill
     * @return
     */
    public boolean add(Bill bill);

    /**
     * 通过条件获取订单列表-模糊查询-billList
     *
     * @param bill
     * @return
     */
    public List<Bill> getBillList(Bill bill);

    /**
     * 通过billId删除Bill
     *
     * @param delId
     * @return
     */
    public boolean deleteBillById(String delId);


    /**
     * 通过billId获取Bill
     *
     * @param id
     * @return
     */
    public Bill getBillById(String id);

    /**
     * 修改订单信息
     *
     * @param bill
     * @return
     */
    public boolean modify(Bill bill);

}
