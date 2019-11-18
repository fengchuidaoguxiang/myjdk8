package com.wjx.jdk8.lesson12;

import java.util.*;

public class OptionalTest2 {

    public static void main(String[] args) {
        OptionalTest2 test2 = new OptionalTest2();
        test2.getEmployees();
    }
    public List<Employee> getEmployees(){
        Employee employee = new Employee();
        employee.setName("zhangsan");

        Employee employee2 = new Employee();
        employee2.setName("lisi");

        Company company = new Company();
        company.setName("company1");

        List<Employee> employees = Arrays.asList(employee,employee2);
//        company.setEmployees(employees);

        List<Employee> list = company.getEmployees();

        //以前的做法
//        if(null != list){
//            return list;
//        }else {
//            return new ArrayList<Employee>();
//        }

        //推荐的做法
        Optional<Company> optional = Optional.ofNullable(company);
        System.out.println(optional.map( theCompany -> theCompany.getEmployees()).orElse(Collections.emptyList()));

        return optional.map( theCompany -> theCompany.getEmployees()).orElse(Collections.emptyList());
    }

    public void test(){

    }
}
