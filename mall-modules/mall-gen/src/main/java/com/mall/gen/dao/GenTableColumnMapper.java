package com.mall.gen.dao;


import com.mall.gen.domain.GenTableColumn;

import java.util.List;

public interface GenTableColumnMapper {
    /**
     * 根据表名称查询列信息
     *
     * @param tableName 表名称
     * @return 列信息
     */
    List<GenTableColumn> selectDbTableColumnsByName(String tableName);

}
