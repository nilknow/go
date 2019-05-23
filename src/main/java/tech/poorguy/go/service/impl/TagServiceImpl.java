package tech.poorguy.go.service.impl;

import tech.poorguy.go.entity.Tag;
import tech.poorguy.go.mapper.TagMapper;
import tech.poorguy.go.service.ITagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author poorguy
 * @since 2019-05-23
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

}
