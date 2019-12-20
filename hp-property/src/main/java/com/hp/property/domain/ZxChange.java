package com.hp.property.domain;

import com.hp.common.annotation.Excel;
import com.hp.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.Id;

/**
 * 资产变更对象 zx_change
 * 
 * @author hp
 * @date 2019-12-20
 */
public class ZxChange extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Id
    private Long id;

    /** 资产id */
    @Excel(name = "资产id")
    private Long assetsId;

    /** 变动类型 */
    @Excel(name = "变动类型")
    private Integer changeType;

    /** 提交部门 */
    @Excel(name = "提交部门")
    private Integer submittedDepartment;

    /** 提交人 */
    @Excel(name = "提交人")
    private String submitOne;

    /** 使用部门 */
    @Excel(name = "使用部门")
    private Integer useDepartment;

    /** 使用人 */
    @Excel(name = "使用人")
    private String users;

    /** $column.columnComment */
    @Excel(name = "使用人")
    private String extend1;

    /** $column.columnComment */
    @Excel(name = "使用人")
    private String extend2;

    /** $column.columnComment */
    @Excel(name = "使用人")
    private String extend3;

    /** $column.columnComment */
    @Excel(name = "使用人")
    private String extend4;

    /** $column.columnComment */
    @Excel(name = "使用人")
    private String extend5;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAssetsId(Long assetsId) 
    {
        this.assetsId = assetsId;
    }

    public Long getAssetsId() 
    {
        return assetsId;
    }
    public void setChangeType(Integer changeType) 
    {
        this.changeType = changeType;
    }

    public Integer getChangeType() 
    {
        return changeType;
    }
    public void setSubmittedDepartment(Integer submittedDepartment) 
    {
        this.submittedDepartment = submittedDepartment;
    }

    public Integer getSubmittedDepartment() 
    {
        return submittedDepartment;
    }
    public void setSubmitOne(String submitOne) 
    {
        this.submitOne = submitOne;
    }

    public String getSubmitOne() 
    {
        return submitOne;
    }
    public void setUseDepartment(Integer useDepartment) 
    {
        this.useDepartment = useDepartment;
    }

    public Integer getUseDepartment() 
    {
        return useDepartment;
    }
    public void setUsers(String users) 
    {
        this.users = users;
    }

    public String getUsers() 
    {
        return users;
    }
    public void setExtend1(String extend1) 
    {
        this.extend1 = extend1;
    }

    public String getExtend1() 
    {
        return extend1;
    }
    public void setExtend2(String extend2) 
    {
        this.extend2 = extend2;
    }

    public String getExtend2() 
    {
        return extend2;
    }
    public void setExtend3(String extend3) 
    {
        this.extend3 = extend3;
    }

    public String getExtend3() 
    {
        return extend3;
    }
    public void setExtend4(String extend4) 
    {
        this.extend4 = extend4;
    }

    public String getExtend4() 
    {
        return extend4;
    }
    public void setExtend5(String extend5) 
    {
        this.extend5 = extend5;
    }

    public String getExtend5() 
    {
        return extend5;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("assetsId", getAssetsId())
            .append("changeType", getChangeType())
            .append("submittedDepartment", getSubmittedDepartment())
            .append("submitOne", getSubmitOne())
            .append("useDepartment", getUseDepartment())
            .append("users", getUsers())
            .append("extend1", getExtend1())
            .append("extend2", getExtend2())
            .append("extend3", getExtend3())
            .append("extend4", getExtend4())
            .append("extend5", getExtend5())
            .toString();
    }
}
