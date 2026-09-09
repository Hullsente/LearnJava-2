package com.cxk06602.bugcrusher.design.state;

/**
 * @author cxk06602
 * @apiNote 等待获得物品
 */
public class GetItemState implements State{

    @Override
    public void handle(StateContext stateContext) {
        System.out.println("等待运输方获得物品");
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
        stateContext.setState(new TransportState());
        return true;
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