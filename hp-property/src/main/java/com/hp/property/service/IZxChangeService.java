package com.hp.property.service;

import com.hp.property.domain.ZxChange;

import java.util.List;

/**
 * 资产变更Service接口
 * 
 * @author hp
 * @date 2019-12-20
 */
public interface IZxChangeService 
{
    /**
     * 查询资产变更
     * 
     * @param id 资产变更ID
     * @return 资产变更
     */
    public ZxChange selectZxChangeById(Long id);

    /**
     * 查询资产变更列表
     * 
     * @param zxChange 资产变更
     * @return 资产变更集合
     */
    public List<ZxChange> selectZxChangeList(ZxChange zxChange);

    /**
     * 新增资产变更
     * 
     * @param zxChange 资产变更
     * @return 结果
     */
    public int insertZxChange(ZxChange zxChange);

    /**
     * 修改资产变更
     * 
     * @param zxChange 资产变更
     * @return 结果
     */
    public int updateZxChange(ZxChange zxChange);

    /**
     * 批量删除资产变更
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteZxChangeByIds(String ids);

    /**
     * 删除资产变更信息
     * 
     * @param id 资产变更ID
     * @return 结果
     */
    public int deleteZxChangeById(Long id);
}
