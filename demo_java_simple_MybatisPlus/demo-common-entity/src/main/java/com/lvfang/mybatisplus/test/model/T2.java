package com.lvfang.mybatisplus.test.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Lvfang
 * @since 2022-05-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_t2")
public class T2 implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "t2id", type = IdType.AUTO)
    private Integer t2id;

    private String name;


}
