package com.example.demo.base.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is the account model.
 */
@ApiModel(description = "This is the account model.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-09T23:00:41.312+05:30[Asia/Calcutta]")
public class Account  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("amount")
  private String amount = null;

  public Account name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of account holder.
   * @return name
  **/
  @ApiModelProperty(value = "The name of account holder.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Account amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The total amount in account
   * @return amount
  **/
  @ApiModelProperty(value = "The total amount in account")
  
    public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.name, account.name) &&
        Objects.equals(this.amount, account.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
