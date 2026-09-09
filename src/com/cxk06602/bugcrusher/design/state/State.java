package com.cxk06602.bugcrusher.design.state;

/**
 * @author cxk06602
 * @apiNote 保证每个状态都有实现handle方法
 */
public interface State{
    void handle(AllStateContent allStateContent);
    boolean nextWaitSellerState(AllStateContent allStateContent);
    boolean nextGetItemState(AllStateContent allStateContent);
    boolean nextTransportState(AllStateContent allStateContent);
    boolean nextWaitBuyerFinishingState(AllStateContent allStateContent);
    boolean nextFinishState(AllStateContent allStateContent);
}