package org.camunda.bpm.demo.orderconfirmation.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Order.class)
public abstract class Order_ {

	public static volatile SingularAttribute<Order, Integer> amount;
	public static volatile SingularAttribute<Order, Integer> discount;
	public static volatile SingularAttribute<Order, String> discountReason;
	public static volatile SingularAttribute<Order, Long> id;
	public static volatile SingularAttribute<Order, Long> version;
	public static volatile SingularAttribute<Order, Customer> customer;

}

