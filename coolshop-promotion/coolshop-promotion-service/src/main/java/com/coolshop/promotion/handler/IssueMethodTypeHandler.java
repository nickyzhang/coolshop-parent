package com.coolshop.promotion.handler;

import com.coolshop.promotion.enums.IssueMethodType;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IssueMethodTypeHandler extends BaseTypeHandler<IssueMethodType> {

    private Class<IssueMethodType> type;

    public IssueMethodTypeHandler(Class<IssueMethodType> type) {
        if (type == null)
            throw new IllegalArgumentException("Type argument cannot be null");
        this.type = type;
    }

    @Override
    public void setNonNullParameter(PreparedStatement statement, int i, IssueMethodType scopeType, JdbcType jdbcType) throws SQLException {
        statement.setInt(i,scopeType.getCode());
    }

    @Override
    public IssueMethodType getNullableResult(ResultSet rs, String columnName) throws SQLException {
        // 根据数据库存储类型决定获取类型
        int code = rs.getInt(columnName);
        return !rs.wasNull() ? IssueMethodType.getEnum(code) : null;
    }

    @Override
    public IssueMethodType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        // 根据数据库存储类型决定获取类型
        int code = rs.getInt(columnIndex);
        return !rs.wasNull() ? IssueMethodType.getEnum(code) : null;
    }

    @Override
    public IssueMethodType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        // 根据数据库存储类型决定获取类型
        int code = cs.getInt(columnIndex);
        return !cs.wasNull() ? IssueMethodType.getEnum(code) : null;
    }
}
