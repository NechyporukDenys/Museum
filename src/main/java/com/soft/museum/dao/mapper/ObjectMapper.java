package com.soft.museum.dao.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface ObjectMapper<T> {
  T extractFromResultSet(ResultSet resultSet) throws SQLException;
}
