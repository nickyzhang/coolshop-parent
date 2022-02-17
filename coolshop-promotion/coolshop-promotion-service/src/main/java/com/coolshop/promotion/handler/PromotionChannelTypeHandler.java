package com.coolshop.promotion.handler;

import com.coolshop.promotion.enums.PromotionChannelType;
import com.coolshop.promotion.enums.UserScopeType;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PromotionChannelTypeHandler extends BaseTypeHandler<PromotionChannelType> {

    private Class<PromotionChannelType> type;

    public PromotionChannelTypeHandler(Class<PromotionChannelType> type) {
        if (type == null)
            throw new IllegalArgumentException("Type argument cannot be null");
        this.type = type;
    }

    @Override
    public void setNonNullParameter(PreparedStatement statement, int i, PromotionChannelType scopeType, JdbcType jdbcType) throws SQLException {
        statement.setInt(i,scopeType.getCode());
    }

    @Override
    public PromotionChannelType getNullableResult(ResultSet rs, String columnName) throws SQLException {
        // 根据数据库存储类型决定获取类型
        int code = rs.getInt(columnName);
        return !rs.wasNull() ? PromotionChannelType.getEnum(code) : null;
    }

    @Override
    public PromotionChannelType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        // 根据数据库存储类型决定获取类型
        int code = rs.getInt(columnIndex);
        return !rs.wasNull() ? PromotionChannelType.getEnum(code) : null;
    }

    @Override
    public PromotionChannelType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        // 根据数据库存储类型决定获取类型
        int code = cs.getInt(columnIndex);
        return !cs.wasNull() ? PromotionChannelType.getEnum(code) : null;
    }
}
