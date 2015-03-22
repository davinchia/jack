package com.rapleaf.jack.queries;

public class JoinConditionBuilder {
  private final AbstractGenericQuery genericQuery;
  private final JoinType joinType;
  private final Table table;

  JoinConditionBuilder(AbstractGenericQuery genericQuery, JoinType joinType, Table table) {
    this.genericQuery = genericQuery;
    this.joinType = joinType;
    this.table = table;
  }

  public AbstractGenericQuery on(Column column1, Column column2) {
    genericQuery.addJoinCondition(new JoinCondition(joinType, table, column1, column2));
    return genericQuery;
  }
}
