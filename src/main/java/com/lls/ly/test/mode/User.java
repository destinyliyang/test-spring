package com.lls.ly.test.mode;

import lombok.*;

import java.io.Serializable;

/**
 * User: Liyang
 * Date: 2018/10/21
 * Time: 15:00
 */
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = -4141744578835387204L;

    private Long id;

    private String name;

    private int sex;

    private int age;
}
