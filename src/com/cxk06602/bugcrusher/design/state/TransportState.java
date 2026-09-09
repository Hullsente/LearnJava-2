package com.cxk06602.bugcrusher.design.state;

/**
 * @author cxk06602
 * @apiNote 物品运输中
 */
public class TransportState implements State{

    @Override
    public void handle(AllStateContent allStateContent) {
        System.out.println("等待物品运输");
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
        allStateContent.setState(new WaitBuyerFinishingState());
        return true;
    }

    @Override
    public boolean nextFinishState(AllStateContent allStateContent) {
        return false;
    }

}