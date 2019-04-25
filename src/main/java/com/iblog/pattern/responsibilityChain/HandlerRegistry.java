package com.iblog.pattern.responsibilityChain;

import com.iblog.pattern.responsibilityChain.handler.*;

import java.io.Serializable;

public class HandlerRegistry implements Serializable {
    private static final long serialVersionUID = 1L;

    public static ServiceSupport get() {
        return LazyLoader.support;
    }

    private static class LazyLoader {

        private static final ServiceSupport support = build();

        /**
         * Construct the responsibility chain.
         * @return
         */
        private static ServiceSupport build() {
            OtherSupport otherSupport = new OtherSupport();

            ReturnSupport returnSupport = new ReturnSupport(otherSupport);

            ProductQualitySupport qualitySupport = new ProductQualitySupport(returnSupport);

            CommoditySupplySupport supplySupport = new CommoditySupplySupport(qualitySupport);

            PromotionsSupport promotionsSupport = new PromotionsSupport(supplySupport);

            PreSalesSupport preSalesSupport = new PreSalesSupport(promotionsSupport);

            return new ServiceSupport(preSalesSupport);
        }
    }
}
