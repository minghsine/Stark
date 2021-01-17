package com.minghsin.stark.mapper;

import com.minghsin.stark.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author minghsin
 * @since 2021-01-17
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
