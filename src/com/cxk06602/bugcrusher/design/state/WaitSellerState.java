package com.cxk06602.bugcrusher.design.state;

/**
 * @author cxk06602
 * @apiNote 等待卖家确认
 */
public class WaitSellerState implements State{

    @Override
    public void handle(AllStateContent allStateContent) {
        System.out.println("等待卖家确认");
    }

    @Override
    public boolean nextWaitSellerState(AllStateContent allStateContent) {
        return false;
    }

    @Override
    public boolean nextGetItemState(AllStateContent allStateContent) {
        allStateContent.setState(new GetItemState());
        return true;
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