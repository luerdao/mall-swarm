package top.luerdao.pet.service.impl;

import top.luerdao.pet.entity.Article;
import top.luerdao.pet.mapper.ArticleMapper;
import top.luerdao.pet.service.ArticleService;
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
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
