package top.luerdao.pet.service.impl;

import top.luerdao.pet.entity.User;
import top.luerdao.pet.mapper.UserMapper;
import top.luerdao.pet.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author luerdao
 * @since 2022-03-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
