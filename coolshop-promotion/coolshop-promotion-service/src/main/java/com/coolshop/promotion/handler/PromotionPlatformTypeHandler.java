package com.coolshop.promotion.handler;

import com.coolshop.promotion.enums.PromotionPlatformType;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PromotionPlatformTypeHandler extends BaseTypeHandler<PromotionPlatformType> {

    private Class<PromotionPlatformType> type;

    public PromotionPlatformTypeHandler(Class<PromotionPlatformType> type) {
        if (type == null)
            throw new IllegalArgumentException("Type argument cannot be null");
        this.type = type;
    }

    @Override
    public void setNonNullParameter(PreparedStatement statement, int i, PromotionPlatformType scopeType, JdbcType jdbcType) throws SQLException {
        statement.setInt(i,scopeType.getCode());
    }

    @Override
    public PromotionPlatformType getNullableResult(ResultSet rs, String columnName) throws SQLException {
        // 根据数据库存储类型决定获取类型
        int code = rs.getInt(columnName);
        return !rs.wasNull() ? PromotionPlatformType.getEnum(code) : null;
    }

    @Override
    public PromotionPlatformType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        // 根据数据库存储类型决定获取类型
        int code = rs.getInt(columnIndex);
        return !rs.wasNull() ? PromotionPlatformType.getEnum(code) : null;
    }

    @Override
    public PromotionPlatformType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        // 根据数据库存储类型决定获取类型
        int code = cs.getInt(columnIndex);
        return !cs.wasNull() ? PromotionPlatformType.getEnum(code) : null;
    }
}
