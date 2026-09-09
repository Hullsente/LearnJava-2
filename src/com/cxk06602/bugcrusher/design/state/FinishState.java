package com.cxk06602.bugcrusher.design.state;

/**
 * @author cxk06602
 * @apiNote 完成状态
 */
public class FinishState implements State{

    @Override
    public void handle(AllStateContent allStateContent) {
        System.out.println("此订单运输完成");
    }

    @Override
    public boolean nextWaitSellerState(AllStateContent allStateContent) {
        return false;
    }

    @Override
    public boolean nextGetItemState(AllStateContent allStateContent) {
        return false;
    }

    @Override
    public boolean nextTransportState(AllStateContent allStateContent) {
        return false;
    }

    @Override
    public boolean nextWaitBuyerFinishingState(AllStateContent allStateContent) {
        return false;
    }

    @Override
    public boolean nextFinishState(AllStateContent allStateContent) {
        return false;
    }
}