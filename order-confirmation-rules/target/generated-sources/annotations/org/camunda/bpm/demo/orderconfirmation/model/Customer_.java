package org.camunda.bpm.demo.orderconfirmation.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Customer.class)
public abstract class Customer_ {

	public static volatile SingularAttribute<Customer, String> company;
	public static volatile SingularAttribute<Customer, Long> id;
	public static volatile SingularAttribute<Customer, Long> version;
	public static volatile SingularAttribute<Customer, String> email;

}

