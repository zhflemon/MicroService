package com.study.springcloud.springcloudordinaryorderservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderInfo {

    //订单ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //订单号
    @Column
    private String orderNo;
    //订单备注
    @Column
    private String orderRemark;

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderRemark() {
		return orderRemark;
	}
	public void setOrderRemark(String orderRemark) {
		this.orderRemark = orderRemark;
	}
    
    
    }