package com.coolshop.promotion.handler;

import com.coolshop.promotion.enums.ActivityStatusType;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ActivityStatusTypeHandler extends BaseTypeHandler<ActivityStatusType> {

    private Class<ActivityStatusType> type;

    private final ActivityStatusType[] enums;

    public ActivityStatusTypeHandler(Class<ActivityStatusType> type) {
        if (type == null)
            throw new IllegalArgumentException("Type argument cannot be null");
        this.type = type;
        this.enums = type.getEnumConstants();
        if (this.enums == null) {
            throw new IllegalArgumentException(type.getSimpleName() + " does not represent an enum type.");
        }
    }

    @Override
    public void setNonNullParameter(PreparedStatement statement, int i, ActivityStatusType scopeType, JdbcType jdbcType) throws SQLException {
        statement.setInt(i,scopeType.getCode());
    }

    @Override
    public ActivityStatusType getNullableResult(ResultSet rs, String columnName) throws SQLException {
        // 根据数据库存储类型决定获取类型
        int code = rs.getInt(columnName);
        return !rs.wasNull() ? getEnum(code) : null;
    }

    @Override
    public ActivityStatusType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        // 根据数据库存储类型决定获取类型
        int code = rs.getInt(columnIndex);
        return !rs.wasNull() ? getEnum(code) : null;
    }

    @Override
    public ActivityStatusType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        // 根据数据库存储类型决定获取类型
        int code = cs.getInt(columnIndex);
        return !cs.wasNull() ? getEnum(code) : null;
    }

    private ActivityStatusType getEnum(int code) {
        for (ActivityStatusType status :enums) {
            if (status.getCode().equals(code)){
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown enum type：" + code + ",please check" + type.getSimpleName());
    }
}
