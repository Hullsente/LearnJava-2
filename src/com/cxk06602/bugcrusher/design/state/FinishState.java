package com.cxk06602.bugcrusher.design.state;

/**
 * @author cxk06602
 * @apiNote 完成状态
 */
public class FinishState implements State{

    @Override
    public void handle(StateContext stateContext) {
        System.out.println("此订单运输完成");
    }

    @Override
    public boolean nextWaitSellerState(StateContext stateContext) {
        return false;
    }

    @Override
    public boolean nextGetItemState(StateContext stateContext) {
        return false;
    }

    @Override
    public boolean nextTransportState(StateContext stateContext) {
        return false;
    }

    @Override
    public boolean nextWaitBuyerFinishingState(StateContext stateContext) {
        return false;
    }

    @Override
    public boolean nextFinishState(StateContext stateContext) {
        return false;
    }
}