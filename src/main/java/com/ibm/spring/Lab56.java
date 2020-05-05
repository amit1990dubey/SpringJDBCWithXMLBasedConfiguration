package com.ibm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab56 {

    public static void main(String[] args) {


        ApplicationContext  ctx = new ClassPathXmlApplicationContext("ibmindia.xml");

        CustomerDAO cdao = (CustomerDAO)ctx.getBean("cdao");

        //1.add Customer
        CustometTO cto = new CustometTO(458,"amit","a@ibm.com",3456789,"Bangalore");
        cdao.addCustomer(cto);


        //2 . update Customer
        CustometTO cto1 = new CustometTO(458,"smiti","s@ibc.com",5678954,"Trv");
        cdao.updateCustomer(cto1);

        //3. Delete Customer
        cdao.deleteCustomer(107);
        System.out.println("check your DB");
    }


}
