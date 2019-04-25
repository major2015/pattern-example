package com.iblog.pattern.responsibilityChain;

import com.iblog.pattern.responsibilityChain.handler.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class HandlerRegistryTest {
    private final ServiceSupport support = HandlerRegistry.get();

    @Test(expected = IllegalArgumentException.class)
    public void testNull() {
        Service service = new Service.Builder(null)
                .setId("1")
                .setDescription("Test case: category is null")
                .build();
        Solution.Builder solution = new Solution.Builder(service.getId());

        ServiceExchange exchange = new ServiceExchange(service, solution);
        support.handle(exchange);
    }

    @Test
    public void testOther() {
        Service service = new Service.Builder(Category.OTHER)
                .setId("1")
                .setDescription("Test case: other")
                .build();
        Solution.Builder builder = new Solution.Builder(service.getId());

        ServiceExchange exchange = new ServiceExchange(service, builder);
        support.handle(exchange);
        Solution solution = exchange.getSolution().build();
        assertEquals(OtherSupport.class.getSimpleName(), solution.getSolvedBy());
        assertTrue(solution.isSolved());
    }

    @Test
    public void testPreSales() {
        Service service = new Service.Builder(Category.PRE_SALES_PRODUCT_CONSULTATION)
                .setId("1")
                .setDescription("Test case: pre-sales")
                .build();
        Solution.Builder builder = new Solution.Builder(service.getId());

        ServiceExchange exchange = new ServiceExchange(service, builder);
        support.handle(exchange);
        Solution solution = exchange.getSolution().build();
        assertEquals(PreSalesSupport.class.getSimpleName(), solution.getSolvedBy());
        assertTrue(solution.isSolved());
    }

    @Test
    public void testPromotions() {
        Service service = new Service.Builder(Category.PROMOTIONS)
                .setId("1")
                .setDescription("Test case: promotions")
                .build();
        Solution.Builder builder = new Solution.Builder(service.getId());

        ServiceExchange exchange = new ServiceExchange(service, builder);
        support.handle(exchange);
        Solution solution = exchange.getSolution().build();
        assertEquals(PromotionsSupport.class.getSimpleName(), solution.getSolvedBy());
        assertTrue(solution.isSolved());
    }

    @Test
    public void testProductQuality() {
        Service service = new Service.Builder(Category.PRODUCT_QUALITY)
                .setId("1")
                .setDescription("Test case: product quality")
                .build();
        Solution.Builder builder = new Solution.Builder(service.getId());

        ServiceExchange exchange = new ServiceExchange(service, builder);
        support.handle(exchange);
        Solution solution = exchange.getSolution().build();
        assertEquals(ProductQualitySupport.class.getSimpleName(), solution.getSolvedBy());
        assertTrue(solution.isSolved());
    }

    @Test
    public void testCommoditySupply() {
        Service service = new Service.Builder(Category.COMMODITY_SUPPLY_CHAIN)
                .setId("1")
                .setDescription("Test case: commodity supply")
                .build();
        Solution.Builder builder = new Solution.Builder(service.getId());

        ServiceExchange exchange = new ServiceExchange(service, builder);
        support.handle(exchange);
        Solution solution = exchange.getSolution().build();
        assertEquals(CommoditySupplySupport.class.getSimpleName(), solution.getSolvedBy());
        assertTrue(solution.isSolved());
    }

    @Test
    public void testReturn() {
        Service service = new Service.Builder(Category.RETURN_SERVICE)
                .setId("1")
                .setDescription("Test case: return")
                .build();
        Solution.Builder builder = new Solution.Builder(service.getId());

        ServiceExchange exchange = new ServiceExchange(service, builder);
        support.handle(exchange);
        Solution solution = exchange.getSolution().build();
        assertEquals(ReturnSupport.class.getSimpleName(), solution.getSolvedBy());
        assertTrue(solution.isSolved());
    }
}