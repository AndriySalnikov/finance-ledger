package ua.pp.salnikov.financeledger.entity;

import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class Account {

  private Long id;
  private String name;
  private Long balance;
  private String currency;

}