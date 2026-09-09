package com.cxk06602.bugcrusher.design.state;

/**
 * @author cxk06602
 * @apiNote 物品运输中
 */
public class TransportState implements State{

    @Override
    public void handle(StateContext stateContext) {
        System.out.println("等待物品运输");
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
        stateContext.setState(new WaitBuyerFinishingState());
        return true;
    }

    @Override
    public boolean nextFinishState(StateContext stateContext) {
        return false;
    }

}