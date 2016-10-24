package org.camunda.bpm.demo.orderconfirmation.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(DiscountRuleEntry.class)
public abstract class DiscountRuleEntry_ {

	public static volatile SingularAttribute<DiscountRuleEntry, Integer> amountMax;
	public static volatile SingularAttribute<DiscountRuleEntry, Integer> amountMin;
	public static volatile SingularAttribute<DiscountRuleEntry, String> name;
	public static volatile SingularAttribute<DiscountRuleEntry, Integer> discount;
	public static volatile SingularAttribute<DiscountRuleEntry, Long> id;
	public static volatile SingularAttribute<DiscountRuleEntry, Long> version;

}

