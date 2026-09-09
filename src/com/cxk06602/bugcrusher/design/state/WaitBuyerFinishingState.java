package com.cxk06602.bugcrusher.design.state;

/**
 * @author cxk06602
 * @apiNote 等待买家确认
 */
public class WaitBuyerFinishingState implements State{

    @Override
    public void handle(AllStateContent allStateContent) {
        System.out.println("等待买家确认收获");
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
        return false;
    }

    @Override
    public boolean nextFinishState(AllStateContent allStateContent) {
        allStateContent.setState(new FinishState());
        return true;
    }
}