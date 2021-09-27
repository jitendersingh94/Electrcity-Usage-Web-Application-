package edu.csus.csc131.project.usage;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_USAGE")
class Usage {

  private @Id @GeneratedValue Long id;

  private String description;
  private Status status;

  Usage() {}

  Usage(String description, Status status) {

    this.description = description;
    this.status = status;
  }

  public Long getID() {
    return this.id;
  }

  public String getDescription() {
    return this.description;
  }

  public Status getStatus() {
    return this.status;
  }

  public void setID(Long id) {
    this.id = id;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Usage))
      return false;
    Usage usage = (Usage) o;
    return Objects.equals(this.id, usage.id) && Objects.equals(this.description, usage.description)
        && this.status == usage.status;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.description, this.status);
  }

  @Override
  public String toString() {
    return "Usage{" + "id=" + this.id + ", description='" + this.description + '\'' + ", status=" + this.status + '}';
  }
}


