package com.xuecheng.framework.domain.course;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Category
 *
 * @author th
 * 2019/6/26 10:08
 **/
@Data
@ToString
@Entity
@Table(name = "category")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class Category implements Serializable {

    private String id;
    private String name;
    private String label;
    private String parentid;
    private String isshow;
    private String orderby;
    private String isleaf;
}
