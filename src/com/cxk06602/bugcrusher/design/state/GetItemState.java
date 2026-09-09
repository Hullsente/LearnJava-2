package com.cxk06602.bugcrusher.design.state;

/**
 * @author cxk06602
 * @apiNote 等待获得物品
 */
public class GetItemState implements State{

    @Override
    public void handle(AllStateContent allStateContent) {
        System.out.println("等待运输方获得物品");
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
        allStateContent.setState(new TransportState());
        return true;
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