package tech.poorguy.go.service.impl;

import tech.poorguy.go.entity.User;
import tech.poorguy.go.mapper.UserMapper;
import tech.poorguy.go.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author poorguy
 * @since 2019-05-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
