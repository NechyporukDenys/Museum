package dao.mapper;

import entity.Author;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorMapper implements ObjectMapper<Author> {
  @Override
  public Author extractFromResultSet(ResultSet resultSet) throws SQLException {
    Author author = new Author();
    author.setFirstName(resultSet.getString("name"));
    author.setLastName(resultSet.getString("surname"));
    author.setBornDate(resultSet.getTimestamp("born_date").toLocalDateTime());
    author.setBornDate(resultSet.getTimestamp("death_date").toLocalDateTime());
    return author;
  }
}
