package cn.beehive.admin.service;

import cn.beehive.admin.domain.query.SysParamPageQuery;
import cn.beehive.admin.domain.request.SysParamRequest;
import cn.beehive.admin.domain.vo.SysParamVO;
import cn.beehive.base.domain.entity.SysParamDO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author hncboy
 * @date 2023/5/10
 * 系统参数业务接口
 */
public interface SysParamService extends IService<SysParamDO> {

    /**
     * 参数分页
     *
     * @param query 查询条件
     * @return 分页结果
     */
    IPage<SysParamVO> page(SysParamPageQuery query);

    /**
     * 参数保存
     *
     * @param request 请求参数
     * @return id
     */
    Integer save(SysParamRequest request);

    /**
     * 参数更新
     *
     * @param request 请求参数
     */
    void update(SysParamRequest request);

    /**
     * 参数删除
     *
     * @param id id
     */
    void remove(Integer id);
}
