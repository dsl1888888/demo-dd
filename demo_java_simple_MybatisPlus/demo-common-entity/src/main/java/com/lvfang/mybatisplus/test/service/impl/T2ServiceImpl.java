package com.lvfang.mybatisplus.test.service.impl;

import com.lvfang.mybatisplus.test.model.T2;
import com.lvfang.mybatisplus.test.mapper.T2Mapper;
import com.lvfang.mybatisplus.test.service.IT2Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Lvfang
 * @since 2022-05-25
 */
@Service
public class T2ServiceImpl extends ServiceImpl<T2Mapper, T2> implements IT2Service {

}
