package ua.pp.salnikov.financeledger.dto;

public record AccountDTO(
    String id,
    String name,
    String balance,
    String currency
) {}
