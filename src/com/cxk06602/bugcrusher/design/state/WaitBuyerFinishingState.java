package com.cxk06602.bugcrusher.design.state;

/**
 * @author cxk06602
 * @apiNote 等待买家确认
 */
public class WaitBuyerFinishingState implements State{

    @Override
    public void handle(StateContext stateContext) {
        System.out.println("等待买家确认收获");
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
        stateContext.setState(new FinishState());
        return true;
    }
}