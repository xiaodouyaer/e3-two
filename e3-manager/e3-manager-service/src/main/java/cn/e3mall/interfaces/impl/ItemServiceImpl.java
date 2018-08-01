package cn.e3mall.interfaces.impl;

import cn.e3mall.interfaces.ItemService;
import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* Created By LiuChaoya 
* On 2018/8/1
* For Luke
*/
@Service
public class ItemServiceImpl implements ItemService {

	@Resource()
	private TbItemMapper tbItemMapper;

	@Override
	public TbItem getItemById(long id) {
		//根据主键查询
		TbItem tbItem = tbItemMapper.selectByPrimaryKey(id);
//		TbItemExample example = new TbItemExample();
//		TbItemExample.Criteria criteria = example.createCriteria();
//		//设置查询条件
//		criteria.andIdEqualTo(id);
//		//执行查询
//		List<TbItem> list = tbItemMapper.selectByExample(example);
//		if (list != null && list.size() > 0) {
//			return list.get(0);
//		}
		return tbItem;
	}
}
