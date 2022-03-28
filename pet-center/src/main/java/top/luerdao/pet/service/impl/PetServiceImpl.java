package top.luerdao.pet.service.impl;

import top.luerdao.pet.entity.Pet;
import top.luerdao.pet.mapper.PetMapper;
import top.luerdao.pet.service.PetService;
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
public class PetServiceImpl extends ServiceImpl<PetMapper, Pet> implements PetService {

}
