package com.xworkz.mall.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer_db")
@Entity

@NamedNativeQuery(name = "findByName1", query = "select customer_feedback.* \r\n"
+ "from customer_feedback \r\n" + "left JOIN customer_db \r\n"+ "ON customer_feedback.feedback_id= customer_db.feedback_id\r\n"
		+ "where customer_db.name=:cn",resultClass = CustomerFeedbackEntity.class)


//@NamedQuery(name = "findByName",query = "select customer from CustomerEntity customer where customer.name=:cn")
@NamedQuery(name = "findByEmail",query = "select customer from CustomerEntity customer where customer.email=:em")
@NamedQuery(name = "findByMobileNo",query = "select customer from CustomerEntity customer where customer.mobileNo=:mb")
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customer_id;
	@Column(name="Name")
	private String name;
	@Column(name="Email")
	private String email;
	@Column(name="Mobile No")
	private long mobileNo;
	@Column(name="Age")
	private int age;
	@Column(name="Country")
	private String country;
	@Column(name="State")
	private String state;
	@Column(name="City")
	private String city;
	@Column(name="Pincode")
	private long pincode;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "feedback_id")
	private CustomerFeedbackEntity customerFeedbackEntity;
	
	
	public CustomerEntity(String name, String email, long mobileNo, int age, String country, String state, String city,
			long pincode, CustomerFeedbackEntity customerFeedbackEntity) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.age = age;
		this.country = country;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.customerFeedbackEntity = customerFeedbackEntity;
	}

}
