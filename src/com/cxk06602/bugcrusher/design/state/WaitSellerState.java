package com.cxk06602.bugcrusher.design.state;

/**
 * @author cxk06602
 * @apiNote 等待卖家确认
 */
public class WaitSellerState implements State{

    @Override
    public void handle(StateContext stateContext) {
        System.out.println("等待卖家确认");
    }

    @Override
    public boolean nextWaitSellerState(StateContext stateContext) {
        return false;
    }

    @Override
    public boolean nextGetItemState(StateContext stateContext) {
        stateContext.setState(new GetItemState());
        return true;
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