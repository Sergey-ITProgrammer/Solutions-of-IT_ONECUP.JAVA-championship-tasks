package com.solution.allcups.reportbuilder.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class TableQuery {
    @Id
    private Integer queryId;

    private String tableName;

    private String query;
}
