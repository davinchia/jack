package com.rapleaf.jack.sql_operators;

import com.rapleaf.jack.SqlOperator;

public class Between<N extends Number> extends SqlOperator<N> {
  @Override
  public String getSqlStatement() {
    return " < ? ";
  }
}
