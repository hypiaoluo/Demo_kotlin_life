package com.example.yanghang.demo_kotlin_life.entity;

import org.greenrobot.greendao.annotation.Id;

/**
 * Created by yanghang
 * on 2018/5/14.
 */

public class dbSimple {
    @Id
    private Long id;
    /**
     * 项目名称
     */
    private String projectName;
}
