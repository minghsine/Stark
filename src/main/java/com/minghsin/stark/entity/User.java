package com.minghsin.stark.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author minghsin
 * @since 2021-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 用户id
     */
    private Integer id;

      /**
     * 用户名
     */
    private String name;

      /**
     * 用户年龄
     */
    private Integer age;


}
