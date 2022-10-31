package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private TransactionRepository transactionRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, TransactionRepository transactionRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.transactionRepository = transactionRepository;
    }

    public OrderDto process (final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct());

        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            transactionRepository.createTransaction(orderRequest.getUser(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }

    }
}
