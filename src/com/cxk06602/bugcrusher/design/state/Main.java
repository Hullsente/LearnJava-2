package com.cxk06602.bugcrusher.design.state;

public class Main {
    static void main() throws InterruptedException{
        StateContext stateContext = new StateContext(new WaitSellerState());
        stateContext.action();

        for (int i = 0; i < 100000; i++) {
            if(
                    !switch ((int)(Math.random() * 5)){
                        case 0 -> stateContext.getState().nextWaitSellerState(stateContext);
                        case 1 -> stateContext.getState().nextGetItemState(stateContext);
                        case 2 -> stateContext.getState().nextTransportState(stateContext);
                        case 3 -> stateContext.getState().nextWaitBuyerFinishingState(stateContext);
                        case 4 -> stateContext.getState().nextFinishState(stateContext);
                        default -> throw new IllegalStateException("Unexpected value: " + (int)(Math.random() * 5));
                    }
            ) {
                System.out.println("等待请求");
                Thread.sleep(1000);
                System.out.println("获得请求");
                continue;
            }
            stateContext.action();
            if(stateContext.getState() instanceof FinishState){
                System.out.println("程序结束");
                break;
            }
        }
    }
}
