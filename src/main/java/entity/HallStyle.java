package entity;

import lombok.*;

import java.util.Objects;

@Data
public class HallStyle {
  private Long id;
  private String name;

  @Override
  public String toString() {
    return "HallStyle{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    HallStyle hallStyle = (HallStyle) o;
    return Objects.equals(id, hallStyle.id) &&
            Objects.equals(name, hallStyle.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
