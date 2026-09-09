package com.cxk06602.bugcrusher.design.state;

/**
 * @author cxk06602
 * @apiNote 保证每个状态都有实现handle方法
 */
public interface State{
    void handle(StateContext stateContext);
    boolean nextWaitSellerState(StateContext stateContext);
    boolean nextGetItemState(StateContext stateContext);
    boolean nextTransportState(StateContext stateContext);
    boolean nextWaitBuyerFinishingState(StateContext stateContext);
    boolean nextFinishState(StateContext stateContext);
}