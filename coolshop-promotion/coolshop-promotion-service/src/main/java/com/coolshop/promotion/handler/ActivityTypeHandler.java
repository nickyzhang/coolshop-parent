package com.coolshop.promotion.handler;

import com.coolshop.promotion.enums.ActivityStatusType;
import com.coolshop.promotion.enums.ActivityType;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ActivityTypeHandler extends BaseTypeHandler<ActivityType> {

    private Class<ActivityType> type;

    private final ActivityType[] enums;

    public ActivityTypeHandler(Class<ActivityType> type) {
        if (type == null)
            throw new IllegalArgumentException("Type argument cannot be null");
        this.type = type;
        this.enums = type.getEnumConstants();
        if (this.enums == null) {
            throw new IllegalArgumentException(type.getSimpleName() + " does not represent an enum type.");
        }
    }

    @Override
    public void setNonNullParameter(PreparedStatement statement, int i, ActivityType scopeType, JdbcType jdbcType) throws SQLException {
        statement.setInt(i,scopeType.getCode());
    }

    @Override
    public ActivityType getNullableResult(ResultSet rs, String columnName) throws SQLException {
        // 根据数据库存储类型决定获取类型
        int code = rs.getInt(columnName);
        return !rs.wasNull() ? getEnum(code) : null;
    }

    @Override
    public ActivityType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        // 根据数据库存储类型决定获取类型
        int code = rs.getInt(columnIndex);
        return !rs.wasNull() ? getEnum(code) : null;
    }

    @Override
    public ActivityType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        // 根据数据库存储类型决定获取类型
        int code = cs.getInt(columnIndex);
        return !cs.wasNull() ? getEnum(code) : null;
    }

    private ActivityType getEnum(int code) {
        for (ActivityType activityType :enums) {
            if (activityType.getCode().equals(code)){
                return activityType;
            }
        }
        throw new IllegalArgumentException("Unknown enum type：" + code + ",please check" + type.getSimpleName());
    }
}
