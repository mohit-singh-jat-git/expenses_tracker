package com.example.expenseTracker.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExpenseDto {
    private Long id;
    private String name;
    private String description;
    private Double amount;
    private String date;
    private String category;
    private Long userId;

}
