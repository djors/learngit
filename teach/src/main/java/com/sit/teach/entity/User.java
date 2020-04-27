package com.sit.teach.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity  //告诉JPA这是一个实体类，和数据表映射的类
@Table(name="数据库中的表名")  //指定和那个数据表对应，如果省略默认就是类名小写（user）
public class User {
    @Id  //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private int id;

    @Column(name = "也可随意取")  //这是和数据表对应的一个列
    private String name;
    //识别用户身份？
}
